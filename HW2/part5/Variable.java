class Variable {
	private String name;
	private int scope; 
	public Variable(String name, int scope) {
		this.name = name;

	}

	int get_scope(){

		return scope; 
	}
	
	String get_name() {
		return name;
	}		
}
