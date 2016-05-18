package ch4.prim;

import java.util.stream.*;
import static java.lang.System.out;
import java.util.*;

public class Sum {
public static void main(String... args) {

Stream<Integer> s1 = Stream.of(1,2,3,4,5);
Optional<Integer> sum = s1.reduce(Math::addExact);
sum.ifPresent(out::println);

}}