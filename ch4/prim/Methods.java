package ch4.prim;

import java.util.stream.*;

public class Methods {
public static void main(String... args) {

IntStream i1 = IntStream.empty();

i1 = IntStream.of(1,2,3);

i1 = IntStream.generate(()->1).limit(20);

i1 = IntStream.iterate(0,i -> i+2).limit(10);
i1.forEach(System.out::println);

i1 = IntStream.range(0,6);
i1 = IntStream.rangeClosed(0,5);

}}