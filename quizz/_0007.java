package quizz;

import java.util.function.IntBinaryOperator;
import static java.lang.System.out;

class _0007 {
public static void main(String... args) {

int c = 2;
IntBinaryOperator i = (a,b) -> a+c;
out.println(i.apply(1,10));

}
}
