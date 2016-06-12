package ch4.collect;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.Collector;

public class Common {
public static void main(String... args) {

StringBuilder sb = Stream.of("1","2","3")
	.collect(StringBuilder::new,
		StringBuilder::append,
		StringBuilder::append);

Collector<String> c = Collectors.joining();

}}
