package quizz;

import static java.lang.System.out;
import java.util.*;

class Some<T> {
static <R> void meth() {
out.println("meth");
} 
}

public class _0541 {

public static void main(String... args) {

Some<? extends Number> some = new Some<Integer>();

Some.<String>meth();

}
}
