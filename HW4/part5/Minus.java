public class Minus {
	public static IntSeq minus(IntSeq a, IntSeq b) {
		int size = 0;
		boolean flag = true;

		// We need to find the size of our array first:
		
		// Iterate through a:
		for(int i = 0; i < a.count; i++) {
			// Iterate through b:
			for(int j = 0; j < b.count; j++) {
				// If find an existing match:
				if(a.intArray[i] == b.intArray[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				size++;
			}
			else
				flag = true;
		}
		
		// Now do the same thing to fill the array:	
		int numbers[] = new int[size], pos = 0;		
		
		// Iterate through a:
		for(int i = 0; i < a.count; i++) {
			// Iterate through b:
			for(int j = 0; j < b.count; j++) {
				// If find an existing match:
				if(a.intArray[i] == b.intArray[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				numbers[pos] = a.intArray[i];
				pos++;
			}
			else
				flag = true;
		}		
		
		return new IntSeq(numbers);	
	}
	
	public static CharSeq minus(CharSeq a, CharSeq b) {
		String str = "";
		boolean flag = true;
		
		// Iterate through a:
		for(int i = 0; i < a.length; i++) {
			// Iterate through b:
			for(int j = 0; j < b.length; j++) {
				// If find an existing match:
				if(a.value.charAt(i) == b.value.charAt(j)) {
					flag = false;
					break;
				}
			}
			
			if(flag)
				str += a.value.charAt(i);
			else
				flag = true;
		}
		
		return new CharSeq(str);
	}	
	
	public static CharSeq minus(IntSeq b, CharSeq a) {
		String str = "";
		boolean flag = true;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.count; j++) {
				if(i == b.intArray[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag)
				str += a.value.charAt(i);
			else
				flag = true;
		}
		
		return new CharSeq(str);	
	}	
	
	public static CharSeq minus(CharSeq a, IntSeq b) {
		String str = "";
		boolean flag = true;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.count; j++) {
				if(i == b.intArray[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag)
				str += a.value.charAt(i);
			else
				flag = true;
		}
		
		return new CharSeq(str);		
	}	
}

