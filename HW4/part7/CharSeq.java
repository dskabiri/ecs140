public class CharSeq extends Seq {

	protected String value; 
	protected int length;

CharSeq(String v) {
	length = v.length();
	value = v;
}

public String toString() {	
	String str;

	str = "{" + Integer.toString(length) + ":" + " \"" + value + "\"" + "}";

	return str; 
}

public int posMax() {
	int max;
	if(length == 0)
		return -1;
	else {
		max = 0;
		for(int i = 1; i < length; i++) {
			if(value.charAt(i) > value.charAt(max))
				max = i;
		}
	}
	return max;
}

}





