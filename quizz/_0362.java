package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;

public class _0362 {

public static void main(String... args) {

Stream<String> source = Stream.of("one","two","three");
List<String> asList = source.collect(ArrayList::new,
	ArrayList::add,
	ArrayList::addAll);

out.println(asList);

}}


