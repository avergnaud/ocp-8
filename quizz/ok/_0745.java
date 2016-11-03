package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;

/* Set vs Map */
public class _0745 {
public static void main(String... args) {

Map<Integer,String> map2 = Stream.of("a","b")
	.collect(Collectors.toMap(
					String::length,
					Function.identity(),
					String::concat
				));
out.println(map2);

}}
