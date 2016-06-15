package ch4;

import java.util.stream.Stream;
import java.util.*;
import static java.lang.System.out;

public class FlatMapAgain {
public static void main(String... args) {

Stream<List<Integer>> streamOfLists = Stream.of(
Arrays.asList(1,2,3),
Arrays.asList(4,5,6),
Arrays.asList(7,8,9)
);

streamOfLists
	.flatMap(list -> list.stream())
	.map(i->i*i)
	.forEach(out::println);

}}