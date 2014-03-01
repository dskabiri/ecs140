public class CharSeqUser {
	public static int posMax1(CharSeq s) {
		int max = -1, count = 0;
		CharSeqIt S = new CharSeqIt(s);
			
		try {	
			// Set initial position:
			if(S.hasNext()) {
				max = 0;
				S.next();
			}
			
			// Iterate through all characters:
			while(S.hasNext()) {
				count++;

				// Set new max position if the condition is met:
				if(S.next() > s.value.charAt(max))
					max = count;
			} 
	
			return max;
		}
		catch(UsingIteratorPastEndException e) {
			return max;
		}
	}

	public static int posMax2(CharSeq s) {
		int max = -1, count = 0;
		CharSeqIt S = new CharSeqIt(s);	
		
		try {
			// Set initial position as max = 0 if no exception thrown:
			S.next();
			max = 0;
		
			while(true) {
				count++;
							
				// Set new max position if condition is met:
				if(S.next() > s.value.charAt(max))
					max = count;
			}
		}
		catch(UsingIteratorPastEndException e) {
		}
		
		return max;		
	}	
}





