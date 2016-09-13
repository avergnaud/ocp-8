package ch7;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class Recap {

static Stream<String> getSerial() {
return Stream.iterate(0,i-> ++i)
	.map(i->i + " ")
	.limit(10);
}

public static final void main(String... args) {

out.println("SERIAL STREAMS");/* SERIAL STREAMS */
out.println("Reduce methods");//Reduce methods
Optional<String> first = getSerial().reduce(String::concat);
first.ifPresent(out::println);

String second = getSerial().reduce("",String::concat);
out.println(second);

String third = getSerial().reduce("",
	String::concat,
	String::concat);
out.println(third);

out.println("Collect methods");//Collect methods
StringBuilder sb1 = getSerial().collect(
	StringBuilder::new,
	StringBuilder::append,
	StringBuilder::append);
out.println(sb1.toString());

List<String> list1 = getSerial().collect(
	ArrayList::new,
	ArrayList::add,
	ArrayList::addAll);
out.println(list1);

TreeSet<String> set1 = getSerial().collect(
	TreeSet::new,
	TreeSet::add,
	TreeSet::addAll);
out.println(set1);

List<String> list2 = getSerial().collect(
	Collectors.toList());
out.println(list2);

TreeSet<String> set2 = getSerial().collect(
	Collectors.toCollection(TreeSet::new));
out.println(set2);

Set<String> set3 = getSerial().collect(
	Collectors.toSet());
out.println(set3);

out.println("averagingDouble");
double average1 = getSerial()
	.map(String::trim)
	.collect(
		Collectors.averagingDouble(Double::parseDouble));
out.println(average1);

out.println("averagingInt");
double average2 = Stream.iterate(0,i->++i)
	.limit(100)
	.collect(Collectors.averagingInt(Integer::intValue));
out.println(average2);

double average3 = Stream.of("Henri","Pierre","Albert","Richard")
	.collect(Collectors.averagingLong(String::length));
out.println(average3);

out.println("counting");
Long l = Stream.of(1,2,3)
	.collect(Collectors.counting());
out.println(l);

out.println("grouping by");
Stream<String> gStream = Stream.of("jon","andrew","harvey","bil");
Map<Integer,List<String>> groups = gStream.collect(
	Collectors.groupingBy(String::length));
out.println(groups);

/*Map<Integer,HashSet> withSet = Stream.of("jon","andrew","harvey","bil")
	.collect(
		Collectors.groupingBy(String::length,
			HashSet::new));*/
Map<Integer,Set<String>> withSet = Stream.of("jon","andrew","harvey","bil")
	.collect(
		Collectors.groupingBy(String::length,
			Collectors.toSet()));
out.println(withSet);

out.println("joining");
String joined = Stream.of("a","b","c")
	.collect(Collectors.joining());
out.println(joined);

out.println("toMap");
Map<String,Integer> tm1 = Stream.of("jon","andrew","harvey","bil").collect(
	Collectors.toMap(Function.identity(),String::length));
out.println(tm1);

Map<Integer,String> tm2 = Stream.of("jon","andrew","harvey","bil")
	.collect(Collectors.toMap(
	String::length,
	Function.identity(),
	(s1,s2)->s1 + "-" + s2));
out.println(tm2);

TreeMap<Integer,String> tm3 = Stream.of("jon","andrew","harvey","bil")
	.collect(Collectors.toMap(
	String::length,
	Function.identity(),
	(s1,s2)->s1 + "-" + s2,
	TreeMap::new));
out.println(tm3);

}}
