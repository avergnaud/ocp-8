package ch3.gens;

import java.util.List;

class NumberHelper<N extends Number> {

public void get(N... numbers) {
Object[] objectArray = numbers;     // Valid
}

}

/*
A reifiable type is a type whose type information is fully available at runtime. 
This includes primitives, non-generic types, raw types, and invocations of unbound wildcards.

Non-reifiable types are types where information has been removed at compile-time by 
type erasure — invocations of generic types that are not defined as unbounded wildcards. 
A non-reifiable type does not have all of its information available at runtime. 
Examples of non-reifiable types are List<String> and List<Number>; 
the JVM cannot tell the difference between these types at runtime.

When the compiler encounters a varargs method, it translates the varargs formal 
parameter into an array
However, the Java programming language does not permit the creation of arrays 
of parameterized types

*/

class UnSafeVarargs {

static <T> T[] asArray(T... args) {
System.out.println("asArray");
return args;
}

static <T> T[] arrayOfTwo(T a, T b) {
System.out.println("arrayOfTwo");
return asArray(a,b);
}

}

public class MyGen {
public static void main(String[] args) {
/*String[] bar = UnSafeVarargs.asArray("hello","world"); it works when T is known to be a concrete type for that call*/
String[] bar = UnSafeVarargs.arrayOfTwo("hello","world");/*ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;*/
/*
However, it does not work when the "value" of T is another type parameter. 
In Java, it is impossible to create an array of a type-parameter component type (new T[] { ... }). 
So Java instead uses new Object[] { ... } 
(here Object is the upper bound of T; if there upper bound were something different, it would be that instead of Object), 
and then gives you a compiler warning.

So what is wrong with creating new Object[] instead of new T[] or whatever? 
Well, arrays in Java know their component type at runtime. 
Thus, the passed array object will have the wrong component type at runtime.

http://stackoverflow.com/questions/14231037/java-safevarargs-annotation-does-a-standard-or-best-practice-exist
*/
}
}