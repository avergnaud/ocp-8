package quizz;

import static java.lang.System.out;

class Parent {
private static int x;
class Enfant extends Parent {
	void methode() {out.println(x);}
}
}

public class _0617 {

public static void main(String... args) {

Parent.Enfant e = new Parent().new Enfant();
e.methode();

}}

