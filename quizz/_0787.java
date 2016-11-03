package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class _0787 {

public static void main(String... args) {

Stream<String> si = Stream.of("1","2","11","44");
TreeMap<Integer,String> tm = si
	.collect(Collectors.toMap(
		String::length,
		Function.identity(),
		(s1,s2)->s1+"/"+s2,
		TreeMap::new));
out.println(tm);

Stream<String> si2 = Stream.of("1","2","11","44");
TreeMap<Integer,Set<String>> tm2 = si2
	.collect(Collectors.groupingBy(
		String::length,
		TreeMap::new,
		Collectors.toSet()));
out.println(tm2);

}}
