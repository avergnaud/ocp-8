package quizz;

import static java.lang.System.out;
import java.util.stream.*;

public class _0852 {

public static void main(String... args) {

Stream<Integer> s = Stream.of(3,4,1,7,5,6,2).parallel();
s.peek(out::print).sorted().peek(out::print).count();


}}

