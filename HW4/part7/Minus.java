public class Minus {
	public static IntSeq minus(IntSeq a, IntSeq b) {
		int size = 0, a_int;
		boolean flag = true;
		IntSeqIt aa = new IntSeqIt(a), bb = new IntSeqIt(b);

		// We need to find the size of our array first:
		
		try {
			// Iterate through a:
			while(aa.hasNext()) {
				a_int = aa.next();
				// Iterate through b:
				while(bb.hasNext()) {
					// If find an existing match:
					if(a_int == bb.next()) {
						flag = false;
						break;
					}
				}
			
				if(flag) {
					size++;
				}
				else
					flag = true;
					
				// Reset bb's iterator to the start:
				bb.cur = -1;					
			}
		}
		catch(UsingIteratorPastEndException e) {}
		
		// Now do the same thing to fill the array:	
		int numbers[] = new int[size], pos = 0;	
		
		// Reset aa and bb's iterator to the start:
		aa.cur = -1;
		bb.cur = -1;			
		
		try {
			// Iterate through a:
			while(aa.hasNext()) {
				a_int = aa.next();
				// Iterate through b:
				while(bb.hasNext()) {
					// If find an existing match:
					if(a_int == bb.next()) {
						flag = false;
						break;
					}
				}
			
				if(flag) {
					numbers[pos] = a_int;
					pos++;
				}
				else
					flag = true;
					
				// Reset bb's iterator to the start:
				bb.cur = -1;					
			}
		}
		catch(UsingIteratorPastEndException e) {}		
		
		return new IntSeq(numbers);	
	}
	
	public static CharSeq minus(CharSeq a, CharSeq b) {
		String str = "";
		char a_char;
		boolean flag = true;
		CharSeqIt aa = new CharSeqIt(a), bb = new CharSeqIt(b);
		
		try {
			// Iterate through a:
			while(aa.hasNext()) {
				a_char = aa.next();
				// Iterate through b:
				while(bb.hasNext()) {
					// If find an existing match:
					if(a_char == bb.next()) {
						flag = false;
						break;
					}
				}
			
				if(flag)
					str += a_char;
				else
					flag = true;
				
				// Reset bb's iterator to the start:
				bb.cur = -1;
			}
		}
		catch(UsingIteratorPastEndException e) {}		
		
		return new CharSeq(str);
	}	
	
	public static CharSeq minus(IntSeq b, CharSeq a) {
		String str = "";
		int i = -1;
		char a_char;
		boolean flag = true;
		CharSeqIt aa = new CharSeqIt(a);
		IntSeqIt bb = new IntSeqIt(b);
		
		try {
			while(aa.hasNext()) {
				i++;
				a_char = aa.next();
				while(bb.hasNext()) {
					if(i == bb.next()) {
						flag = false;
						break;
					}
				}
			
				if(flag)
					str += a_char;
				else
					flag = true;
					
				// Reset bb's iterator to the start:
				bb.cur = -1;					
			}
		}
		catch(UsingIteratorPastEndException e) {}
				
		return new CharSeq(str);		
	}
	
	public static CharSeq minus(CharSeq a, IntSeq b) {
		String str = "";
		int i = -1;
		char a_char;
		boolean flag = true;
		CharSeqIt aa = new CharSeqIt(a);
		IntSeqIt bb = new IntSeqIt(b);
		
		try {
			while(aa.hasNext()) {
				i++;
				a_char = aa.next();
				while(bb.hasNext()) {
					if(i == bb.next()) {
						flag = false;
						break;
					}
				}
			
				if(flag)
					str += a_char;
				else
					flag = true;
					
				// Reset bb's iterator to the start:
				bb.cur = -1;					
			}
		}
		catch(UsingIteratorPastEndException e) {}
				
		return new CharSeq(str);		
	}	
}

