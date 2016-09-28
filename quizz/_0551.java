package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;

public class _0551 {

static Stream<String> getStream() {
return Stream.of("","Isaac","Henri","Karl","Albert","Jon Jon","Pierre","Serge");
}


public static void main(String... args) {

Stream<Integer> si = getStream()
	.map(String::length);

si.forEach(out::println);

Map<Integer,List<String>> m = getStream()
	.collect(Collectors.groupingBy(String::length));
out.println(m);

}}
