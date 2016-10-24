package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.function.*;

public class _0716 {

public static void main(String... args) {
/*
Stream.of("a","c","z","b","e","d")
  .sorted()
  .forEach(out::print);

Consumer<String> consumer = (string) -> out.print(string);

Stream.of("a","c","z","b","e","d")
  .sorted()
  .forEach(consumer);

Stream.of("a","c","z","b","e","d")
  .sorted()
  .forEach((string) -> out.print(string));


Consumer<String> : public void accept(String t)
PrintStream : public void print(String s)
*/

Stream.of("a","c","z","b","e","d")
  .sorted()
  .forEach(out::print);

  

}}
