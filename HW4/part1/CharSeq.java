

class CharSeq extends Seq{

	protected String value; 
	protected int length;
	protected String str;

CharSeq(String v){
	length = v.length();
	value = v;
}

public String toString()
{	
	
	str = "{" + Integer.toString(length) + ":" + " \"" + value + "\"" + "}";

	return str; 

}

}





