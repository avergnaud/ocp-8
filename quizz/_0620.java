package quizz;

import static java.lang.System.out;

public class _0620 {

private int x = 24;

public int getX() {
	String message = "x is ";
	class Inner {
		private int x = _0620.this.x;
		public void printX() {
			out.println(message + x);
		}
	}
	Inner in = new Inner();
	in.printX();
	return x;
}

public static void main(String... args) {
new _0620().getX();
}}

