package so;


class Bar {
  static int init() {
    System.out.println("interface Foo initialized");
    return 0;
  }
}

interface Foo {
  int dummy=Bar.init();
  //default void anyMethod(){}
}


class Impl implements Foo {}

public class InterfaceMadness {
  public static void main(String[] args) {
    Impl i=new Impl();
    //int lol = i.dummy;
  }
}




/*
https://docs.oracle.com/javase/specs/jls/se8/html/jls-12.html#jls-12.4

When a class is initialized, its superclasses are initialized (if they have not 
been previously initialized), as well as any superinterfaces (§8.1.5) that declare 
any default methods (§9.4.3) (if they have not been previously initialized). 
Initialization of an interface does not, of itself, cause initialization of any of 
its superinterfaces.

A reference to a static field (§8.3.1.1) causes initialization of only the class 
or interface that actually declares it, even though it might be referred to through 
the name of a subclass, a subinterface, or a class that implements an interface.
*/