package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class _0391 {

public static void main( String[] args){

ToIntFunction<Integer> function = Integer::intValue;

Stream<Integer> someStream = Stream.iterate(0,i->++i).limit(100);

int average2 = someStream.collect(Collectors.averagingInt(function));

out.println(average2);

}}


