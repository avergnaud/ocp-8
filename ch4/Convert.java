package ch4;

import java.util.function.*;

public class Convert {
public static void main(String... args) {

Function<String,Integer> f = s -> s.length();
f = String::length;

String toto = "toto";
System.out.println(f.apply(toto));


// String concat(String s1, String s2);
Function<String,String> f1 = "toto"::concat;
f1 = s -> "toto".concat(s);

BiFunction<String,String,String> f2 = String::concat;
f2 = (s,t) -> s.concat(t);

System.out.println(f2.apply("hi"," world"));


//

String hello = "hello";
UnaryOperator<String> uo = hello::concat;

String ensuite = uo.apply(" world");

System.out.println(ensuite);


}
}