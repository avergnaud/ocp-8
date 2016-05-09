package ch4;

import java.util.function.*;

public class StartsWith {
public static void main(String... args) {

//String instance method boolean startsWith(String another)
String toto = "toto";
Predicate<String> premier = toto::startsWith;
premier = s -> toto.startsWith(s);

BiPredicate<String,String> deuxieme = String::startsWith;
deuxieme = (s,t) -> s.startsWith(t);

boolean r = deuxieme.test("helloworld","hel");
System.out.println(r);

}
}