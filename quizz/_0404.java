package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0404 {
public static void main(String... args) {

Optional<Integer> o = Stream.of(1,2,3,4,5,6,7,8).parallel().findAny();

o.ifPresent(out::println);

}}
