package ch2.immutable;

class B {
String s = "toto";
String getS() {return s;}
}

class A {

B b = new B();

B getB() {return b;}

public static void main(String... args) {
B b = new B();
//b.getS() = "lol";error: unexpected type - required variable found value
System.out.println(b.getS());

A a = new A();
//a.getB() = b;error: unexpected type - required variable found value

}
}
