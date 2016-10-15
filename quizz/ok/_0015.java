package quizz;

class Parent {
void print() {System.out.println("hi");}
}

class Enfant extends Parent {}

interface I {
default void print() {System.out.println("hi");}
}

class E implements I {}

public class _0015 {
public static void main(String... args) {
	Enfant e = new Enfant();
	e.print();

	E e2 = new E();
	e2.print();
}
}
