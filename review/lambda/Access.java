package review.lambda;

import java.util.function.*;
import static java.lang.System.*;

public class Access {
public static void main(String... args) {
BinaryOperator<Integer> plus = (a,b) -> a+b;
out.println(plus.apply(2,3));

int c = 2;
plus = (a,b) -> {return a + c;};
out.println(plus.apply(2,3));

plus = (a,b) -> {/*c= 2;*/ return a + c;};
out.println(plus.apply(2,3));

/*local variables referenced from a lambda expression must be final or effectively final
http://stackoverflow.com/questions/4732544/why-are-only-final-variables-accessible-in-anonymous-class?lq=1*/

}
}
