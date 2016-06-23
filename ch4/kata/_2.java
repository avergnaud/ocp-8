package ch4.kata;

import java.util.*;
import java.util.stream.*;
import static java.lang.System.out;

//Filter collection so that only elements with less than 4 characters are returned.
public class _2 {
public static void main(String... args) {

List<String> some = Arrays.asList("adjdlj","1dzdz","aa","444");

some.stream()
	.filter(s -> s.length() < 4)
	.forEach(out::println);

}}