package ch2.inheritance;

class Child extends Parent {

public static void main(String... args) {
	Child child = new Child();
	Child.Inner inner = child.new Inner();
	System.out.println(inner.getFirst());
}
}