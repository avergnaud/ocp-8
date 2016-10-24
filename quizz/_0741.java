package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;

public class _0741 {
public static void main(String... args) {

Optional<Integer> o = Optional.ofNullable(1);

Consumer<Integer> c1 = i -> out.println("c1 prints:" + i);

Consumer<Integer> c2 = i -> out.println("c2 prints:" + i);

o.ifPresent(c1.andThen(c2));

}}