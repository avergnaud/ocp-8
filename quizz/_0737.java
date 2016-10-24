package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

/* collect to set, collect to map */
public class _0737 {

public static void main(String... args) {

Set<String> s = Stream.of("a","b","b")
                      .collect(Collectors.toSet());

out.println(s);

}}
