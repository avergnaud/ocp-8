package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;

public class _0803 {

public static void main(String... args) {

List<String> liste = new ArrayList<>();
liste.add("a");
liste.add("b");
liste.add("ab");
liste.add("bc");

liste.stream().filter(s -> s.length()==1).count();

out.println(liste);

}}

