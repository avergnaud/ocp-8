package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class _0789 {

public static void main(String... args) {

Stream.of("1","2","11","44","bla")
	.collect(Collectors.partitioningBy(
		string->string.length()==1,
		Collectors.counting()))
	.forEach((k,v)->out.println(v + " elements such as length()==1 is " + k));

}}
