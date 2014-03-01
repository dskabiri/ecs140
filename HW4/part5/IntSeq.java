class IntSeq extends Seq{

	protected int count = 0;
	protected int intArray[];
	protected String str;

IntSeq( int ... numbers ) {
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

public int posMax() {
	int max;
	if(count == 0)
		return -1;
	else {
		max = 0;
		for(int i = 1; i < count; i++) {
			if(intArray[i] > intArray[max])
				max = i;
		}
	}

	return max; 
}


}
