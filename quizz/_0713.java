package quizz;

import static java.lang.System.out;
import java.util.stream.*;

public class _0713 {

public static void main(String... args) {

Stream<Integer> integers = Stream.of(1,2,3);
Stream<String> strings = integers.map(Integer::toString);

}}
