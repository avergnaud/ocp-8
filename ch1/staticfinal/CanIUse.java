package ch1.staticfinal;

class Parent {
/*static*/ /*final*/ void myMethod() {
System.out.println("Parent");
}
}

/* http://stackoverflow.com/questions/1743715/behaviour-of-final-static-method */

class CanIUse extends Parent {
/*static*/ final void myMethod() {
System.out.println("CanIUse");
}

public static void main(String... args) {
Parent child = new CanIUse();
child.myMethod();
}

}