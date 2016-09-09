package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;

public class _0363 {

public static void main(String... args) {
/*The following will take a stream of strings and concatenates them into a single string:*/

Stream<String> source = Stream.of("one","two","three");

String result = source.collect(String::new,
	String::concat,
	String::concat);

out.println(result);

}}


