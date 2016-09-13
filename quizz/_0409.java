package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class _0409 {

static Integer randomInteger() {
return new Random().nextInt(2_000);
}

public static void main( String[] args){

//partitioningBy, specifying the type of map that is returned ?

Map<Boolean,List<Integer>> m2 = Stream.generate(_0409::randomInteger)
	.limit(10)
	.collect(Collectors.partitioningBy(i-> i<1_000));
out.println(m2);

}}


