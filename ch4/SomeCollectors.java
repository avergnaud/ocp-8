package ch4;

import java.util.stream.*;
import java.util.*;
import static java.lang.System.out;

public class SomeCollectors {
public static void main(String... args) {

Stream<String> stream = Stream.of("w","o","l","f");

//unknown type
Set<String> s1 = stream.collect(Collectors.toSet());
out.println(s1);

stream = Stream.of("w","o","l","f");
Set<String> s2 = stream.collect(
	Collectors.toCollection(TreeSet::new));
out.println(s2);

}}