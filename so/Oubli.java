package so;

class A {
	static int a = 10;
	static int getA() {return a;}
}
class B extends A {}

class Oubli {
public static void main(String... args) {
System.out.println(B.a);
System.out.println(B.getA());
System.out.println(D.a);
//System.out.println(D.getA());
}
}

interface C {
	int a = 10;
	static int getA() {return a;}
}

class D implements C {}