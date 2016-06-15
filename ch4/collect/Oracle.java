package ch4.collect;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.lang.System.out;

public class Oracle {

static Stream<String> get() {
 return Stream.of("lions","tigers","bears","cats","dogs","ants","elephants");
}

public static void main(String... args) {


Stream<String> s = get();

// Accumulate names into a List
Stream<String> merc = get();
List<String> mercL = merc.collect(Collectors.toList());
merc = get();
ArrayList<String> mercAL = merc.collect(Collectors.toCollection(ArrayList::new));

List<String> l1 = s.collect(Collectors.toList());

//s = Stream.of("lions","tigers","bears","cats","dogs","ants","elephants");
s = get();
ArrayList<String> l2 = s.collect(Collectors.toCollection(ArrayList::new));

// Accumulate names into a TreeSet
s = get();
TreeSet<String> l3 = s.collect(Collectors.toCollection(TreeSet::new));

// Convert elements to strings and concatenate them, separated by commas
s = get();
String merS = s.collect(Collectors.joining(","));

s = get();
String result = s.collect(Collectors.joining(","));
out.println(result);

// compute sum of lengths of animal names

//int merTotal = s.collect(COllectors.summingInt(String::length));

s = get();
int total = s.collect(Collectors.summingInt(String::length));
out.println(total);

// group animal names by length

s = get();

Map<Integers,List<String>> merMap = s.collect(Collectors.groupingBy(String::length));


s = get();
Map<Integer,String> myMap = s.collect(Collectors.toMap(
	String::length,
	Function.identity(),
	(s1,s2)->s1+","+s2
	));
out.println(myMap);

s=get();
TreeMap<Integer,String> myMap2 = s.collect(Collectors.toMap(
	String::length,
	Function.identity(),
	(s1,s2)->s1+","+s2,
	TreeMap::new
	));
out.println(myMap2);


// compute number of animal names by length
s = get();
Map<Integer,Long> howMany = s.collect(
	Collectors.groupingBy(
		String::length,
		Collectors.counting()));
out.println(howMany);

s = get();
Map<Integer,List<String>> howMany2 = s.collect(
	Collectors.groupingBy(
		String::length));
out.println(howMany2);


// partition animal names by < or > than 5 chars


}}