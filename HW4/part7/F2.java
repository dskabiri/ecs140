public class F2 {
	public static IntSeq ApplyToAll2(Main.AA2 fun, IntSeq v1, IntSeq v2) {
		int numbers[], limit;
		
		// First find the limit determined by the smaller size of v1 and v2:
		limit = (v1.count > v2.count) ? v2.count : v1.count; 
		numbers = new int[limit];
		
		for(int i = 0; i < limit; i++) {
			numbers[i] = fun.go(v1.intArray[i], v2.intArray[i]);
		}
		
		return new IntSeq(numbers);
	}
}
