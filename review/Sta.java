package review;

class Parent {
static void print() {System.out.println("hi");}
}

class Enfant extends Parent {}

interface I {
static void print() {System.out.println("hi");}
}

class E implements I {}

public class Sta {
public static void main(String... args) {
	Enfant e = new Enfant();
	e.print();

	E e2 = new E();
	//e2.print();
}
}