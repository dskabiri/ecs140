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
	
	private static final int initVar = 8888;
	
	private void cprint(String str) {
		System.out.println(str); //this prints and makes a new line. 
	}
	
	private void cprints(String str) {
		System.out.print(str);  //this prints but keeps on same line 
	}
	
	

	private void program() { //initiallizing the program by writing include and main() 
		cprint("#include <stdio.h>");
		cprint("int main() ");
		cprint("{");
		block();
	}

	private void block(){
		symtab.push_block();
		cprint("//scope = " + symtab.get_scope());	    			    		
		declaration_list();
		statement_list();
		symtab.pop_block();
		cprint("}");
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
		boolean flag = false;
		mustbe(TK.DECLARE);
		cprints("int ");
		if( is(TK.ID) ) {
			if( symtab.search_block(tok.string) == null ) {
				symtab.add_variable(tok.string);
				cprints("x_" + symtab.get_scope() + tok.string);
				cprint(" //var = " + tok.string);                
			}     
			else {
				System.err.println("redeclaration of variable " + tok.string);
				flag = true;
			}
		}
		mustbe(TK.ID);
		while( is(TK.COMMA) ) {
			scan();
			if( is(TK.ID) ) {
				if( symtab.search_block(tok.string) == null ) {
					symtab.add_variable(tok.string);
					if (!(flag)) {
						cprints(", ");   
						flag = false;
					}
					cprints("x_" + symtab.get_scope() + tok.string); 
					cprint(" //var = " + tok.string);
				}
				else {
					flag = true;
					System.err.println("redeclaration of variable " + tok.string);
				}
			}
			mustbe(TK.ID);
		}
		cprint(";");
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
		cprints(" = ");
		expr();
		cprint(";");
	}    

	private void ref_id() {
		int scope = -2, num = 0;
		boolean flag = true;
		
			// if a ~ is found:
		if( is(TK.TILDE) ) {
			flag = false;
			scan();
					// if ~#, # is the scope:
			if( is(TK.NUM) ) {
				scope = Integer.parseInt(tok.string);
				mustbe(TK.NUM);
				
							// local scope:
				if(scope == 0)
					num = symtab.get_scope();
								// else scope is the difference:
				else 		
					num = symtab.get_scope() - scope;								    				
			}
					// else ~var is global (scope = -1):
			else {
				scope = -1;
				num = 0;
			}
		}

				// No ~ means unknown if variable exists (scope = -2):
		if( is(TK.ID) ) {
			if (scope != -2){ 
				if( symtab.search_scope(tok.string, scope) == null ) {
					if(scope == -1) 
						System.err.println("no such variable ~" + tok.string +
							" on line " + tok.lineNumber);
					else
						System.err.println("no such variable ~" + scope + tok.string +
							" on line " + tok.lineNumber);
					System.exit(1);																						
				}
			}
			else if (scope == -2) {
				if( symtab.search(tok.string) == null ) {
					System.err.println(tok.string + " is an undeclared variable on line "
						+ tok.lineNumber);
					System.exit(1);    						
				}
			}

			if(flag) {
				int i = 0;
				Variable v;
				while(true) {    
					v = symtab.search_scope(tok.string, i);
					if(v != null)
						break;
					i++;
				}
				cprint("//i = " + i);
				cprint("//get_scope = " + symtab.get_scope());	    			
				num = symtab.get_scope() - i;
			}
		}
		
		if(true)
			cprints("x_" + num + tok.string);
		mustbe(TK.ID);
	}
	
	private void print() {
		mustbe(TK.PRINT);
		cprints("printf(\"%d\\n\", ");
			expr();
			cprint(");");
		}
		
		private void _do() {
			mustbe(TK.DO);
			cprints("while( 0 >= (");
				guarded_command();
				mustbe(TK.ENDDO);
			}
			
			private void _if() { 
				mustbe(TK.IF);
				cprints("if( 0 >= (");

					guarded_command();
					
					while( is(TK.ELSEIF) ) {
						scan();
						cprints("else if( 0 >= (");
							guarded_command();
						}
						if( is(TK.ELSE) ) {
							scan();
							cprint("else {");
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
						cprint(")){");
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
						if( is(TK.PLUS) ){
							mustbe(TK.PLUS);
							cprints(" + ");}
							else if( is(TK.MINUS ) ){
								mustbe(TK.MINUS);
								cprints(" - ");}
							}
							
							private void multop() {
								if( is(TK.TIMES) ){
									mustbe(TK.TIMES);
									cprints(" * ");}
									else if( is(TK.DIVIDE ) ){
										mustbe(TK.DIVIDE);
										cprints("/");}
									}		
									
									private void factor() {
										if( is(TK.LPAREN) ) {
											mustbe(TK.LPAREN);
											cprints("(");
												expr();
												mustbe(TK.RPAREN);
												cprints(")");
											}
											else if( is(TK.TILDE) || is(TK.ID) )
												ref_id();
											else if( is(TK.NUM) ){
												cprints(tok.string);
												mustbe(TK.NUM);
											}
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
