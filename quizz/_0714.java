package quizz;

import static java.lang.System.out;
import java.util.stream.*;

public class _0714 {

public static void main(String... args) {

Stream<Integer> integers = Stream.of(1,2,3);
Stream<String> strings = integers
  .map(integer -> integer.toString());

Stream<String> also = integers
  .map(integer -> Integer.toString(integer));

}}
