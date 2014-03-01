import java.util.*;

public class Symtab {

	private Stack<ArrayList<Variable>> stack;
	private int scope;
	
	public Symtab(){
		stack = new Stack<ArrayList<Variable>>();
		scope = -1;
	}
	
	public void push_block() {
		ArrayList<Variable> newBlock = new ArrayList<Variable>();
		stack.push(newBlock);
		scope++;
	}
	
	public void pop_block() {
		stack.pop();
		scope--;
	}
	
	public int get_scope() {
		return scope;
	}
	
	public boolean add_variable(String name) {
		Variable v = search_block(name);
		if(v != null) {
			System.err.println(" redeclaration of variable " + name);
			return false;
		}
		
		Variable var = new Variable(name);
		stack.peek().add(var);
		return true;	
	}
	
	public Variable search(String name) {
		ListIterator<ArrayList<Variable>> blocks = stack.listIterator(stack.size());
		while(blocks.hasPrevious()) {
			ArrayList<Variable> block = blocks.previous();
			for(Variable v : block) {
				if( v.get_name().equals(name) ) {
					return v;
				}
			}
		}
		return null;
	}
	
	public Variable search_block(String name) {
		ArrayList<Variable> block = stack.peek();
		for(Variable v : block) {
			if( v.get_name().equals(name) ) {
				return v;
			}
		}
		return null;
	}
	
	public Variable search_scope(String name, int _scope) {
		int diff;
		
		if(_scope > scope)
			return null;

		if(_scope == 0)
			diff = 0;
		else
			diff = scope - _scope;
		ArrayList<Variable> block = stack.elementAt(diff);
		for(Variable v : block) {		
			if( v.get_name().equals(name) ) {
				return v;
			}
		}
		return null;
	}
}











