package quizz;

import static java.lang.System.out;
import java.util.*;
import java.io.*;

class X {}

class Some<T> {

<X extends T> X method(List<X> list) {
	return list.get(0);
}

}

public class _0043 {

public static void main(String... args) {

List<Integer> liste = Arrays.asList(1,2,3);

Some<Number> some = new Some<>();

out.println(some.method(liste));

}
}
