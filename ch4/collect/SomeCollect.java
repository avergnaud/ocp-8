package ch4.collect;

import java.util.stream.*;
import static java.lang.System.out;
import java.util.*;

public class SomeCollect{

static Stream<String> get() {
	return Stream.of("one","two","three","four");
}

public static void main(String... args) {

Stream<String> s1 = get();
StringBuilder sb1 = s1.collect(
	StringBuilder::new,
	StringBuilder::append,
	StringBuilder::append
	);
out.println(sb1);

s1 = get();
String string = s1.collect(Collectors.joining());
out.println(string);

s1 = get();
Map<Integer,List<String>> map1 = s1.collect(
	Collectors.groupingBy(
		String::length));
out.println(map1);

s1 = get();
Map<Integer,Long> map2 = s1.collect(
	Collectors.groupingBy(
	String::length,
	Collectors.counting()));
out.println(map2);

s1 = get();
Map<Integer,String> map3 = s1.collect(
	Collectors.groupingBy(
	String::length,
	Collectors.joining(" and ")));
out.println(map3);

}}