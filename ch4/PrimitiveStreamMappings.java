package ch4;

import java.util.stream.*;
import java.util.function.*;

public class PrimitiveStreamMappings {
public static void main(String... args) {

/*
-------------------------------------------------------------------------
From obj to ...
-------------------------------------------------------------------------
*/
Stream<String> streamOfStrings = Stream.of("un","deux","trois");
Function<String,StringBuilder> function = StringBuilder::new;
streamOfStrings.map(function)/*.forEach(System.out::println)*/;
streamOfStrings = Stream.of("un","deux","trois");
ToIntFunction<String> toIntFunction = String::length;
IntStream streamOfInts = streamOfStrings.mapToInt(toIntFunction);
streamOfStrings = Stream.of("un","deux","trois");
ToDoubleFunction<String> toDoubleFunction = String::length;
DoubleStream streamOfDoubles = streamOfStrings.mapToDouble(toDoubleFunction);
streamOfStrings = Stream.of("un","deux","trois");
ToLongFunction<String> toLongFunction = String::length;
LongStream streamOfLongs = streamOfStrings.mapToLong(toLongFunction);

/*
-------------------------------------------------------------------------
From int to ...
-------------------------------------------------------------------------
*/
IntUnaryOperator plusplus = i -> i++;
IntStream.of(1,2,3)
	.map(plusplus)
	/*.forEach(x->System.out.println(x))*/;
IntFunction<String> intFunction = i -> ""+i;
IntStream.of(1,2,3)
	.mapToObj(intFunction)
	/*.forEach(System.out::println)*/;
IntToDoubleFunction itdf = i->i;
IntStream.of(1,2,3)
	.mapToDouble(itdf)
	/*.forEach(System.out::println)*/;
IntToLongFunction itlf = i->i;
IntStream.of(1,2,3)
	.mapToLong(itlf)
	/*.forEach(System.out::println)*/;

/*
-------------------------------------------------------------------------
From long to ...
-------------------------------------------------------------------------
*/
LongUnaryOperator times = l ->l*l;
LongStream.of(1L,2L,3L)
	.map(times)
	/*.forEach(System.out::println)*/;
LongFunction<String> lf = l -> "toto";
LongStream.of(1L,2L,3L)
	.mapToObj(lf);

/*
-------------------------------------------------------------------------
From double to ...
-------------------------------------------------------------------------
*/
DoubleToIntFunction dtif = d -> (int)d;
DoubleStream.of(1.3,1.5,1.6)
	.mapToInt(dtif)
	.forEach(System.out::println);


}}
