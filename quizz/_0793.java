package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class _0793 {

public static void main(String... args) {

Stream<Integer> s1 = IntStream.iterate(0,i->++i).mapToObj(i->i);

IntSummaryStatistics iss1 = s1.collect(
	Collectors.summarizingInt(i->i));
out.println(iss1.getAverage());

}}
