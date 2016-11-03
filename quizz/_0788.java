package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class _0788 {

public static void main(String... args) {

Stream<String> si = Stream.of("1","2","11","44");
Map<Boolean,Long> m = si.collect(Collectors.partitioningBy(
	string->string.length()==1,
	Collectors.counting()));
out.println(m);

}}
