package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class _0790 {

public static void main(String... args) {

/*
ça compilait mais ça compile plus

first letter of the first animal alphabetically of each length. Expected:
4,c (for cats and dogs)
5,b (for bears and lions)
6,t
7,m
*/

Stream<String> s = Stream.of("lions","tigers","bears","cats","dogs","monkeys");

Map<Integer,Optional<Character>> m = s.collect(
	Collectors.groupingBy(
		String::length,
		Collectors.mapping(string->string.charAt(0),
			Collectors.minBy(Comparator.naturalOrder()))));
out.println(m);
//m.forEach((k,v)->out.println(k+" letters words. First word starts with "+v.get()));

}}
