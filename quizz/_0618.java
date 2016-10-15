package quizz;

import static java.lang.System.out;

class Parent {
private int x;
class Enfant extends Parent {
	private static int x = 10;
	void methode() {out.println(x);}
}
}

public class _0618 {

public static void main(String... args) {

Parent.Enfant e = new Parent().new Enfant();
e.methode();

}}

