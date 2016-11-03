package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;

/* Set vs Map */
public class _0742 {
public static void main(String... args) {

Set<String> s = new HashSet<>();
out.println(s.add("1"));
out.println(s.add("1"));
out.println(s);

out.println();

Map<String,Integer> map = new HashMap<>();
out.println(map.put("1",1));
out.println(map.put("1",2));
out.println(map);

out.println();

Set<String> s2 = Stream.of("1","1")
	.collect(Collectors.toSet());
out.println(s2);

out.println();

Map<String,Integer> map2 = Stream.of("1","1")
	.collect(Collectors.toMap(
					Function.identity(),
					Integer::new
				));


}}
