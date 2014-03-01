public class CharSeqUser {
	public static int posMax1(CharSeq s) {
		int max = -1, count = 0;
		char max_char;
		CharSeqIt S = new CharSeqIt(s);
		
		if(S.hasNext()) {
			max = 0;
			max_char = S.next();
		}
		
		while(S.hasNext()) {
			count++;

			if(S.next() > s.value.charAt(max))
				max = count;
		} 
		
		return max;
	}
}
