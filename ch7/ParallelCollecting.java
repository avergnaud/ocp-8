package ch7;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;

public class ParallelCollecting {

static Stream<String> getPS() {
return Stream.of("w","o","l","f").parallel();
}

public static void main(String... args) {

Set<String> set = getPS().collect(
	HashSet::new,
	HashSet::add,
	HashSet::addAll);
out.println(set);

List<String> list = getPS().collect(
	ArrayList::new,
	ArrayList::add,
	ArrayList::addAll);
out.println(list);

/*
why does it behave as a serial stream collect?
"Like reduce(Object, BinaryOperator), collect operations can be parallelized without requiring additional synchronization."

All collectors, if they follow the rules in the specification, are safe to run in parallel or sequential. Parallel-readiness is a key part of the design here.

The distinction between concurrent and non-concurrent collectors have to do with the approach to parallelization.

An ordinary (non-concurrent) collector operates by merging sub-results. So the source is partitioned into a bunch of chunks, each chunk is collected into a result container (like a list or a map), and then the sub-results are merged into a bigger result container. This is safe and order-preserving, but for some kinds of containers -- especially maps -- can be expensive, since merging two maps by key is often expensive.

A concurrent collector instead creates one result container, whose insertion operations are guaranteed to be thread-safe, and blasts elements into it from multiple threads. With a highly concurrent result container like ConcurrentHashMap, this approach may well perform better than merging ordinary HashMaps.

So, the concurrent collectors are strictly optimizations over their ordinary counterparts. And they don't come without a cost; because elements are being blasted in from many threads, concurrent collectors generally cannot preserve encounter order. (But, often you don't care -- when creating a word count histogram, you don't care which instance of "foo" you counted first.)

*/

}}
