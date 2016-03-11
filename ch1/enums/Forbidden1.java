package ch1.enums;

enum Foo {
A,
B;

private Foo[] foos = new Foo[] {Foo.A};

/*
It is a compile-time error to reference a static field of an enum type 
that is not a compile-time constant (§15.28) from constructors, instance 
initializer blocks, or instance variable initializer expressions of that type.
ici foos fait partie de l'état de l'enum, cas :
"instance variable initializer"
*/

}


enum MyEnum {

   FOO, BAR;

   private MyEnum() {
        // Illegal
        // FOO already calls this constructor
        System.out.println(FOO);
   }

/*
FOO is equivalent to:
public static final MyEnum foo;

When the enum class is loaded by the JVM, FOO and BAR are created by 
calling the enum private constructor, something like:

foo = MyEnum(); // name of enum, the params are not relevant
bar = MyEnum(); 
*/

}