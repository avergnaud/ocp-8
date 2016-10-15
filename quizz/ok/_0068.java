package quizz;

import static java.lang.System.out;
import java.util.function.*;

public class _0068 {

public static void main(String... args) {

Supplier<String> s1 = String::new;
//out.println(s1.get());

Function<byte[],String> f1 = String::new;
//out.println(f1.apply(new byte[]{'a','b','c'}));

Function<StringBuilder,String> f2 = String::new;
//out.println(f2.apply(new StringBuilder()));

Predicate<String> p1 = String::isEmpty;
out.println(p1.test("not empty"));

p1 = (string) -> string.isEmpty();
out.println(p1.test("not empty"));

String notEmpty = "not empty";
Supplier<Boolean> s2 = notEmpty::isEmpty;
out.println(s2.get());

}
}
