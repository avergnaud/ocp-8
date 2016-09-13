package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.stream.*;
import java.util.*;


public class _0414 {

static Stream<String> getStream() {
return Stream.of("","Isaac","Henri","Karl","Albert","Jon Jon","Pierre","Serge");
}

public static void main( String[] args){

Map<Integer,List<String>> map = getStream()
	.collect(Collectors.groupingBy(String::length));
out.println(map);

Map<Integer,Set<String>> map2 = getStream()
	.collect(Collectors.groupingBy(String::length,
			Collectors.toSet()));
out.println(map2);

TreeMap<Integer,Set<String>> map3 = getStream()
	.collect(Collectors.groupingBy(
			String::length,
			Collectors.toSet(),
			TreeMap::new));
out.println(map3);

}}


