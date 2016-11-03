package quizz;

import static java.lang.System.out;
import java.util.stream.*;

public class _0785 {

public static void main(String... args) {

Stream<Integer> si = Stream.of(1,2,3,4);
out.printf(si.collect(Collectors.joining())).println("done");

}}
