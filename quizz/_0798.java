package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class _0798 {

public static void main(String... args) {

Random rand = new Random();
Optional<Integer> oi = Stream.generate(()->rand.nextInt(1000))
	.limit(100)
	.max(Comparator.naturalOrder());

oi.ifPresent(out::println);

Optional<Integer> oi2 = Stream.generate(()->rand.nextInt(1000))
	.limit(100)
	.collect(Collectors.maxBy(Comparator.naturalOrder()));

oi2.ifPresent(out::println);
}}
