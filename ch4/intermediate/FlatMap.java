package ch4.intermediate;

import java.util.*;
import java.util.stream.*;

public class FlatMap {
public static void main(String... args) {

List<String> l1 = Arrays.asList("trigglypuff","pikachu","stuff");
List<String> l2 = Arrays.asList("sjw","hello","world");

List<List<String>> over = Arrays.asList(l1,l2);

over.stream()
	.flatMap(l -> l.stream())
	.forEach(System.out::println);

//
System.out.println("");
Stream<String> other = Stream.of("1","2","3");
Stream<Integer> last = other
		.flatMap(l -> Stream.of(4,5,6));
last.forEach(System.out::print);
}}
