package ch4.loop;

import java.util.stream.*;
import java.util.*;
import java.util.function.*;
import static java.lang.System.out;

public class Red2 {
public static void main(String... args) {

// T reduce(T seed, BinaryOperator<T> op)
BinaryOperator<Integer> op = (a,b)->a*b;
Stream<Integer> s = Stream.of(2,3,4,5);
Integer res = s.reduce(1,op);
out.println(res);//120 ?

//Optional<T> reduce(BinaryOperator<T> op)
//cas 1
Stream<Integer> e = Stream.empty();
Optional<Integer> o1 = e.reduce(op);
out.println(o1.isPresent());

//cas 2
e = Stream.of(5);
o1 = e.reduce(op);
o1.ifPresent(out::println);

//cas 3
e = Stream.of(5,6);
o1 = e.reduce(op);
o1.ifPresent(out::println);


}}