package quizz;

import static java.lang.System.out;


class Some<T> {

static Some<T> of(T t) {
return new Some<T>();
}

}

public class _0033 {

public static void main(String... args) {

Some<String> some = Some.of("toto");
}

}
