public class F1 {
	public static CharSeq ApplyToAll1(Main.AA1 fun, CharSeq s) {
		String str = "";
		
		for(int i = 0; i < s.length; i++) {
			str += fun.go(s.value.charAt(i));
		}
		
		return new CharSeq(str);
	}
}
