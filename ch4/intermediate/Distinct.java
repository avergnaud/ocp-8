package ch4.intermediate;

import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;

public class Distinct {
public static void main(String... args) {

Stream<Integer> ints = Stream
	.generate(()->ThreadLocalRandom.current().nextInt(0,6))
	.limit(20);
//ints.forEach(System.out::println);

Stream<Integer> distinctInts = Stream
	.generate(()->ThreadLocalRandom.current().nextInt(0,6))
	.limit(20)
	.distinct();
distinctInts.forEach(System.out::println);

}}
