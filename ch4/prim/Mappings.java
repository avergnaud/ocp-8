package ch4.prim;

import java.util.stream.*;

public class Mappings {
public static void main(String... args) {

//FROM obj to...

Stream<String> objectStream = Stream.of("1","2","3");

Stream<Integer> another = objectStream.map(s->Integer.valueOf(s.length()));

IntStream i1 = objectStream.mapToInt(s->s.length());

LongStream i3 = objectStream.mapToLong(s->s.length());

DoubleStream i2 = objectStream.mapToDouble(s->s.length());


//FROM prim to...

IntStream is = IntStream.rangeClosed(0,100);

Stream<String> sString = is.<String>mapToObj(i-> ""+i);

sString = is.mapToObj(i-> ""+i);

LongStream i31 = is.mapToLong(i -> i);

DoubleStream i21 = is.mapToDouble(i -> i);



}}