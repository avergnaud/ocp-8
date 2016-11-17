package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;

/* Set vs Map */
public class _0744 {
public static void main(String... args) {

Map<String,Integer> map2 = Stream.of("a","b")
	.collect(Collectors.toMap(
					Function.identity(),
					String::length
				));
out.println(map2);

}}
