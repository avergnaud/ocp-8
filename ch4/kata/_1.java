package ch4.kata;

import java.util.*;
import java.util.stream.*;
import static java.lang.System.out;

//Convert elements of a collection to upper case
public class _1 {
public static void main(String... args) {

List<String> some = Arrays.asList("adjdlj","1dzdz","aa","444");

List<String> upper = some.stream()
	.map(String::toUpperCase)
	.collect(
		Collectors.toList());

out.println(upper);


}}