package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0553 {

private static final long MAX = 1_000_000;

public static void main( String[] args){

Stream<Long> s = Stream.iterate(0,l->++l).limit(MAX + 1);

Long somme = s.collect(
	Collectors.summingLong(l->l));

out.println(somme);

}}


