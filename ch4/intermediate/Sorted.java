package ch4.intermediate;

import java.util.*;
import static java.lang.System.out;

public class Sorted {
public static void main(String... args) {

List<Integer> liste = Arrays.asList(7,9,2,119,9,3,19,983,1,2,3,45);
liste.stream().sorted().forEach(out::println);	

out.println("");

liste.stream()
	.sorted((i,j)->j-i)
	.forEach(out::println);

out.println("");

liste.stream()
	.sorted(Comparator.reverseOrder())
	.forEach(out::println);
}}
