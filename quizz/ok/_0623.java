package quizz;

import static java.lang.System.out;

public class _0623 {

private int x = 24;

public int getX() {
	final String message = "x is ";
	class Inner {
		private int x = 12;
		public void printX() {
			out.println(message + x);
		}
	}
	Inner in = new Inner();
	in.printX();
	return x;
}

public static void main(String... args) {
new _0623().getX();
}}

