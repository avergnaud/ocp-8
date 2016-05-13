package ch4.java2s;

import java.util.*;
import java.util.stream.*;

public class Test {

public static void main(String... args) {

List<Integer> intS = Stream.iterate(0, n -> n+1).limit(20).collect(Collectors.toCollection(ArrayList::new));

/* use stream to calculate a sum of the squares of all odd integers in the list */

Stream<Integer> numbersStream  = intS.stream();

Stream<Integer> oddnNumbers = numbersStream.filter(i->i%2 == 1);

Stream<Integer> squared = oddnNumbers.map(i -> i*i);

Integer result = squared.reduce(0,(a,b)->a+b);

System.out.println(result);

}}