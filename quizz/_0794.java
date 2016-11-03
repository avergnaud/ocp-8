package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class _0794 {

public static void main(String... args) {

Stream<Integer> s1 = IntStream.iterate(1,i->++i)
	.limit(10)
	.mapToObj(i->i);

IntSummaryStatistics iss1 = s1.collect(
	Collectors.summarizingInt(i->i));
out.println(iss1.getAverage());

IntSummaryStatistics iss2 = IntStream
	.rangeClosed(1,10)
	.summaryStatistics();
out.println(iss2.getAverage());

}}
