package ch7;

import static java.lang.System.out;
import java.util.*;

public class exo {
public static void main(String... args) {

List<Character> liste = Arrays.asList('w','o','l','f');

String wolf = liste.stream()
	.reduce("",
		(s,c)->s+c,
		String::concat);

out.println(wolf);

}}
