package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

/* collect to set, collect to map */
public class _0738 {

public static void main(String... args) {

Map<Integer,String> m = Stream.of("a","b2","b2")
                              .collect(Collectors.toMap(
                                string->string.length(),
                                string->string
                              ));

out.println(m);

}}
