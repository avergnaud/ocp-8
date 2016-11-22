package quizz;

import static java.lang.System.out;
import java.util.function.*;

public class _0860 {

static String id(String s) {
return s;
}

public static void main(String... args)  {

Consumer<String> c = s -> id(s);
out.println(c.accept("rr"));

}}

