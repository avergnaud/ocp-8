package ch1.nested;

public class SNC {

	private int i;

	static class Inner {
		int i = new SNC().i;
	}

	public static void main(String... args) {
		Inner inner = new Inner();
		System.out.println(inner.i);
	}
}
