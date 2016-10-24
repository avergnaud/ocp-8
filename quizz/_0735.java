package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

/* count, min, max, sum, average */
public class _0735 {

public static void main(String... args) {

Stream<Integer> s1 = Stream.of(1,2,3);
long count1 = s1.count();
out.println(count1);

Stream<Integer> s2 = Stream.of(1,1,3);
Optional<Integer> m2 = s2.min(Comparator.naturalOrder());
out.println(m2.orElse(Integer.MIN_VALUE));

OptionalLong ol = LongStream.of(1,2,3)
  .max();
ol.ifPresent(out::println);

long l = IntStream.empty().sum();
out.println(l);

OptionalDouble od = IntStream.rangeClosed(0,10)
  .average();
out.println(od.getAsDouble());

}}
