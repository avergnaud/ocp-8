package ch3.mref;

import java.util.function.*;

public class Tough {
public static void main(String... args) {

/* Calling an instance method on a specific instance : */

Consumer<String> sysou = System.out::println;
Consumer<String> sysou2 = s -> System.out.println(s);
sysou.accept("hello world");

String str = "What";
Predicate<String> sysou3 = str::startsWith;
Predicate<String> sysou4 = s -> str.startsWith(s);
boolean test = sysou4.test("Wh");
System.out.println(test);

Supplier<Integer> supplier1  = "java2s.com"::length; 
//Predicate<String> methodRef2 = "java2s.com"::isEmpty;
/* methodRef2.test(String s) on which parameter ? */

/* calling an instance method on an instance to be determined at runtime : */

Predicate<String> methodRef3 = String::isEmpty;
//Supplier<Integer> supplier2  = String::length; 
/* supplier2.get() on which instance ? */

}
}