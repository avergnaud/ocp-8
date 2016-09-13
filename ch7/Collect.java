package ch7;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.concurrent.*;

public class Collect {
public static void main(String... args) {

Stream<String> some = Stream.of("w","o","l","f");
SortedSet<String> res = some.collect(
	TreeSet::new,
	TreeSet::add,
	TreeSet::addAll);
out.println(res);

SortedSet<String> parallelRes = Stream.of("w","o","l","f")
	.parallel()
	.collect(
	ConcurrentSkipListSet::new,
	ConcurrentSkipListSet::add,
	ConcurrentSkipListSet::addAll);
out.println(parallelRes);

}}
