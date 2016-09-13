package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;


public class _0410 {
public static void main( String[] args){

Stream<String> some = Stream.of("w","o","l","f");
SortedSet<String> res = some.collect(
	SortedSet::new,
	SortedSet::add,
	SortedSet::addAll);
out.println(res);

}}


