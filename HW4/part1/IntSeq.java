class IntSeq extends Seq{

	protected int count = 0;
	protected int intArray[];
	protected String str;

IntSeq( int ... numbers ){
	count = numbers.length;
	intArray = new int[count];

	int i = 0;
	for(int number : numbers) {
		intArray[i] = number;
		i++;
	}

}

public String toString()
{	
	
	str = "[" + String.valueOf(count) + ":";
	
	for(int number : intArray) {
		str += " " + Integer.toString(number);
	}

	str += "]";

	return str; 

}

}
