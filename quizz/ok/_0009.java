package quizz;

import java.util.function.IntBinaryOperator;
import static java.lang.System.out;

class _0009 {
public static void main(String... args) {

int c = 2;
IntBinaryOperator i = (a,b) -> {return a+c;};
out.println(i.applyAsInt(1,10));

}
}
