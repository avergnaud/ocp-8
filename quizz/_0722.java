package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class _0722 {

public static void main(String... args) {

Comparator<String> comp = Comparator.reverseOrder();

Stream.of("a","B","_","123","d")
  .sorted(comp)
  .forEach(out::print);

out.println();

Stream.of("a","B","_","123","d")
  .sorted(Comparator.reverseOrder())
  .forEach(out::print);

out.println();

}}
