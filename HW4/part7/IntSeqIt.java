public class IntSeqIt {
	protected IntSeq I;
	protected int cur = -2;

	IntSeqIt(IntSeq I) {
		this.I = I;

		if(I.count > 0)
			cur = -1;
	}

	public boolean hasNext() {
		if(cur == -2)
			return false;
		else if(cur < I.count - 1)
			return true;
		else 
			return false;

	}

	public int next() throws UsingIteratorPastEndException {
		cur++;

		if(cur >= I.count) {
			throw new UsingIteratorPastEndException();
		}

		return I.intArray[cur];
	}

}
