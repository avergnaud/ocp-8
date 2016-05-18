package ch4;

import java.util.*;
import java.util.stream.*;

public class Exo {
public static void main(String... args) {

// get the first two names alphabetically that are 4 characters long
List<String> liste = Arrays.asList(
"get", "the", "first", "two", "names", "alphabetically", "that", "are", "4", "characters", "long", "aaab");

List<String> resultat = liste.stream()
	.filter(s->s.length()==4)
	.sorted()
	.limit(2)
	.collect(Collectors.toList());

System.out.println(resultat);

}} 
