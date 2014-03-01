public class CharSeqIt {	
	protected CharSeq S;
	protected int cur = -2;

	CharSeqIt(CharSeq S) {
		this.S = S;

		if(S.length > 0)
			cur = -1;
	}

	public boolean hasNext() {
		if(cur == -2)
			return false;
		else if(cur < S.length - 1)
			return true;
		else 
			return false;

	}

	public char next() {
		cur++;

		if(cur >= S.length) {
			System.err.println("CharSeqIt called past end");
			System.exit(1);
		}

		return S.value.charAt(cur);
	}

}
