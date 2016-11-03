package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class _0791 {

public static void main(String... args) {

Stream.of("lions","tigers","bears","cats","dogs","monkeys")
      .collect(
	Collectors.groupingBy(
		String::length,
		Collectors.mapping(string->string.charAt(0),
			Collectors.toSet())))
      .forEach((k,v)->out.println(k+" letters words. First caracters are: "+v));

}}
