package quizz;

import static java.lang.System.out;
import java.util.*;
import java.io.*;

class Some<T> {

<X extends T> X method(List<X> list) {
	return new X();
}

}

public class _0044 {

public static void main(String... args) {

List<Integer> liste = Arrays.asList(1,2,3);

Some<Number> some = new Some<>();

out.println(some.method(liste));

}
}
