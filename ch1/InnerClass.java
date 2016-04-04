package ch1;

public class InnerClass {

int x = 1;

class B {
	int x = InnerClass.this.x + 1;
	class C {
			//int x = InnerClass.B.this.x + 1;
			int x = B.this.x + 1;
	}
}

public static void main(String... args) {
	System.out.println(new InnerClass().new B().new C().x);
	//B b = new B(); error...
	B b = new InnerClass().new B();
	System.out.println(b.x);
	B.C c = b.new C();
	System.out.println(c.x);
}	
}
