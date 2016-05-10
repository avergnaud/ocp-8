package ch4;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.lang.System.out;

public class StreamCre2 {
public static void main(String... args) {

Stream<Integer> intS = Stream.empty();
intS = Stream.of(1);
intS = Stream.of(1,2,3,4);

List<Integer> someList = Arrays.asList(1,2,3,4,5);
intS = someList.stream();

Supplier<Integer> supp = () -> new Integer(10);
intS = Stream.generate(supp);

//intS.forEach(out::println);
intS = Stream.iterate(5,n -> n -1);

}}