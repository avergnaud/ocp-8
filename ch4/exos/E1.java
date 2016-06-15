package ch4.exos;

import java.util.*;
import java.util.stream.*;

public class E1 {
public static void main(String... args) {
/*
the following will accumulate strings into an ArrayList:
*/



Stream<String> stream = Stream.iterate(0, i->++i)
			.limit(20)
			.map(i->" "+i);

List<String> liste = stream.collect(
	ArrayList::new,
	ArrayList::add,
	ArrayList::addAll);

System.out.println(liste);



/*
The following will take a stream of strings and concatenates them into a single string
*/


stream = Stream.iterate(0, i->++i)
			.limit(20)
			.map(i->" "+i);



}}