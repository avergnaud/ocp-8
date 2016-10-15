package quizz;

import static java.lang.System.out;
import java.util.function.*;

public class _0572 {

public static void main(String... args) {

Integer i1 = new Integer("1");
out.println(i1);

Function<String,Integer> f1 = Integer::new;
out.println(f1.apply("2"));

f1 = Integer::valueOf;
out.println(f1.apply("3"));

Supplier<Integer> s = Integer::new;
out.println(s.get());

}}

