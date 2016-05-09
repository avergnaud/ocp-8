package ch3.mref;

import java.util.function.*;
import java.util.*;
import java.time.*;

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

/* calling a constructor ? */
Supplier<StringBuilder> intC = StringBuilder::new;
System.out.println(intC.get());

/* calling a static method */
Supplier<LocalDate> dateSupplier = LocalDate::now;
System.out.println(dateSupplier.get());

/* boolean contains(Object o) */
List<String> maListe = Arrays.asList("trois","deux","un");
Predicate<Object> mrP = maListe::contains;
System.out.println(mrP.test("deux"));

/* boolean isEmpty() */
Predicate<String> feinte = String::isEmpty;
System.out.println(feinte.test(""));

String toto = "";
Supplier<Boolean> aussi = toto::isEmpty;
System.out.println(aussi.get());

System.out.println(maListe);
Consumer<List<String>> myConsumer = Collections::sort;
myConsumer.accept(maListe);
System.out.println(maListe);

BiFunction<Integer,Integer, Integer> max = Math::max;
Integer result = max.apply(2,3);
System.out.println(result);

Function<Integer,Integer> intFun = Integer::new;
result = intFun.apply(10);
System.out.println(result);
}
}