package ch4.intermediate;

import java.util.stream.Stream;

public class Filter {
public static void main(String... args) {

Stream<Integer> intS = Stream.iterate(0,n->n+1).limit(100);

Stream<Integer> evens = intS.filter(i->i%2==0);
evens.forEach(System.out::print);

}}
