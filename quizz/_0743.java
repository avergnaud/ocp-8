package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;

/* Set vs Map */
public class _0743 {
public static void main(String... args) {

Set<String> s2 = Stream.of("1","1")
	.collect(Collectors.toSet());
out.println(s2);

out.println();

Map<String,Integer> map2 = Stream.of("1","1")
	.collect(Collectors.toMap(
					string -> string+"a",
					string -> new Integer(string) + 1,
					(value1,value2) -> value1 + value2
				));
out.println(map2);

}}
