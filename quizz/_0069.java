package quizz;

import static java.lang.System.out;
import java.util.function.*;

public class _0069 {

public static void main(String... args) {

BinaryOperator<String> u1 = String::compareTo;
out.println(u1.apply("a","b"));

}
}
