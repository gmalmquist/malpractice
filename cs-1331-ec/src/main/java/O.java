public class O {
	public static final Integer o = 0;
	public static final O O = new O();

	private O() {}
	
	public static final O O(Object ... o) {
		for (Object s : o) {
			if (s != O.o)
				System.out.print(s);
		}
		return new O();
	}
	
	public static final int o(Object ... o) {
		return o.length;
	}
}