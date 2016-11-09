package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;

public class _0804 {

public static void main(String... args) {

List<String> liste = new ArrayList<>();
liste.add("a");
liste.add("b");
liste.add("ab");
liste.add("bc");

liste.stream().parallel().sorted().forEach(out::print);
out.println();
liste.stream().parallel().sorted().forEachOrdered(out::print);
out.println();

}}

