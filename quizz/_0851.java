package quizz;

import static java.lang.System.out;
import java.util.stream.*;

public class _0851 {

public static void main(String... args) {

Stream<Integer> s = Stream.of(3,9,1,3,8,5,6,2);
s.peek(out::print).sorted().peek(out::print).count();


}}

