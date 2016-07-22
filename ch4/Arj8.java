package ch4;

import java.util.stream.*;


public class Arj8 {
public static void main(String... args) {

Integer[] myA = Stream.of(1,2,3,4)
	.collect(Collectors.toList())
	.toArray(new Integer[0]);

}}
