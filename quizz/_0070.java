package quizz;

import static java.lang.System.out;
import java.util.function.*;

public class _0070 {

public static void main(String... args) {

BiFunction<String,String,Integer> b1 = String::compareTo;
out.println(b1.apply("a","b"));

Function<String,Integer> f1 = "a"::compareTo;
out.println(f1.apply("b"));

IntFunction<String> i1 = "a"::compareTo;
out.println(i1.applyAsInt("b"));

}
}
