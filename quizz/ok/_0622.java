package quizz;

import static java.lang.System.out;

public class _0622 {

private int x = 24;

public int getX() {
	final String message = "x is ";
	class Inner {
		private int x = _0622.this.x;
		public void printX() {
			out.println(message + x);
		}
	}
	Inner in = new Inner();
	in.printX();
	return x;
}

public static void main(String... args) {
new _0622().getX();
}}

