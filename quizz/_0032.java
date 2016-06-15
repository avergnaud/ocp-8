package quizz;

import static java.lang.System.out;


class Some<T> {

static <T> boolean test(Object o) {
return o instanceof T;
}

}

public class _0032 {

public static void main(String... args) {

boolean is = Some.<String>test("toto");
out.println(is);
}

}
