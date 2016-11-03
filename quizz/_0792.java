package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class _0792 {

public static void main(String... args) {

Stream<Integer> s1 = IntStream.iterate(0,i->++i).mapToObj(Function.identity());

}}
