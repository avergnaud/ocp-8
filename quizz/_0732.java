package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

/* count, min, max, sum, average */
public class _0732 {

public static void main(String... args) {

Stream<Integer> s1 = Stream.of(1,2,3);
long count1 = s1.count();
out.println(count1);

Stream<Integer> s2 = Stream.of(1,1,3);
Optional<Integer> m2 = s2.min(Comparator.naturalOrder());
out.println(m2.orElse("no min"));

}}
