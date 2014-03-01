/* *** This file is given as part of the programming assignment. *** */

public class Parser {


	// tok is global to all these parsing methods;
	// scan just calls the scanner's scan method and saves the result in tok.
	private Token tok; // the current token
	Symtab symtab = new Symtab();    
	private void scan() {
		tok = scanner.scan();
	}

	private Scan scanner;
	Parser(Scan scanner) {
		this.scanner = scanner;
		scan();
		program();
		if( tok.kind != TK.EOF )
			parse_error("junk after logical end of program");
	}

	private void program() {
		block();
	}

	private void block(){
		symtab.push_block();
		declaration_list();
		statement_list();
		symtab.pop_block();        
	}

	private void declaration_list() {
		// below checks whether tok is in first set of declaration.
		// here, that's easy since there's only one token kind in the set.
		// in other places, though, there might be more.
		// so, you might want to write a general function to handle that.
		while( is(TK.DECLARE) ) {
			declaration();
		}
	}

	private void declaration() {
		mustbe(TK.DECLARE);
		if( is(TK.ID) ) {
			if( symtab.search_block(tok.string) == null ) {
				symtab.add_variable(tok.string);   
			}     
			else
				System.err.println("redeclaration of variable " + tok.string);
		}
		mustbe(TK.ID);
		while( is(TK.COMMA) ) {
			scan();
			if( is(TK.ID) ) {
				if( symtab.search_block(tok.string) == null ) {
					symtab.add_variable(tok.string);       
				}
				else
					System.err.println("redeclaration of variable " + tok.string);
			}            
			mustbe(TK.ID);
		}
	}

	private void statement_list() {
		while( is(TK.TILDE) || is(TK.ID) || is(TK.PRINT) || is(TK.DO) | is(TK.IF) ) {
			statement();
		}
	}
	
	private void statement() {
		if ( is(TK.TILDE) || is(TK.ID) ) {
			assignment();
		} 
		else if ( is(TK.PRINT) ) {
			print();
		}
		else if ( is(TK.DO) ) {
			_do();
		}
		else if ( is(TK.IF) ) {
			_if();
		}												
	}    
	
	private void assignment() {
		ref_id();
		mustbe(TK.ASSIGN);
		expr();
	}    

	private void ref_id() {
		int scope = -1;
		if( is(TK.TILDE) ) {
			scan();
			if( is(TK.NUM) ) {
				scope = Integer.parseInt(tok.string);
				if(scope == 0)
					scope = -1;
				mustbe(TK.NUM);
			}
			else
				scope = 0;
		}
		if( is(TK.ID) ) {
			if (scope != -1){ 
				if( symtab.search_scope(tok.string, scope) == null ) {
					if(scope == 0) 
						System.err.println("no such variable ~" + tok.string +
							" on line " + tok.lineNumber);
					else
						System.err.println("no such variable ~" + scope + tok.string +
							" on line " + tok.lineNumber);
				}
			}
			else if (scope == -1) {
				if( symtab.search(tok.string) == null ) {
					System.err.println(tok.string + " is an undeclared variable on line "
						+ tok.lineNumber);
					System.exit(1);    						
				}
			}
		}
		mustbe(TK.ID);
	}
	
	private void print() {
		mustbe(TK.PRINT);
		expr();
	}
	
	private void _do() {
		mustbe(TK.DO);
		guarded_command();
		mustbe(TK.ENDDO);
	}
	
	private void _if() { 
		mustbe(TK.IF);           
		guarded_command();
		while( is(TK.ELSEIF) ) {
			scan();
			guarded_command();
		}
		if( is(TK.ELSE) ) {
			scan();
			block();
		}
		mustbe(TK.ENDIF);
	}
	
	private void expr() {  
		term();          
		while ( is(TK.PLUS) || is(TK.MINUS) ) {
			addop();
			term();
		}
	}
	
	private void guarded_command() {            
		expr();
		mustbe(TK.THEN);
		block();
	}    

	private void term() {  
		factor();
		while( is(TK.TIMES) || is(TK.DIVIDE) ) {
			multop();
			factor();
		}
	}		

	private void addop() {  
		if( is(TK.PLUS) )
			mustbe(TK.PLUS);
		else if( is(TK.MINUS ) )
			mustbe(TK.MINUS);
	}
	
	private void multop() {  
		if( is(TK.TIMES) )
			mustbe(TK.TIMES);
		else if( is(TK.DIVIDE ) )
			mustbe(TK.DIVIDE);
	}		
	
	private void factor() {  
		if( is(TK.LPAREN) ) {
			mustbe(TK.LPAREN);
			expr();
			mustbe(TK.RPAREN);
		}
		else if( is(TK.TILDE) || is(TK.ID) )
			ref_id();
		else if( is(TK.NUM) )
			mustbe(TK.NUM);
	}
	
	// is current token what we want?
	private boolean is(TK tk) {
		return tk == tok.kind;
	}

	// ensure current token is tk and skip over it.
	private void mustbe(TK tk) {
		if( ! is(tk) ) {
			System.err.println( "mustbe: want " + tk + ", got " +
				tok);
			parse_error( "missing token (mustbe)" );
		}
		scan();
	}

	private void parse_error(String msg) {
		System.err.println( "can't parse: line "
			+ tok.lineNumber + " " + msg );
		System.exit(1);
	}
}
