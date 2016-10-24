package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class _0398 {

static String randomNumber() {
int i = new Random().nextInt(2_000);
return ""+i;
}

public static void main( String[] args){

//grouping by, specifying the type of map that is returned
Map<Integer,List<String>> m1 =
Stream.generate(_0398::randomNumber).limit(50)
	.collect(Collectors.groupingBy(
	String::length,
	Function.identity(),
	(s1,s2)->s1+","+s2),
	ArrayList::new);
out.println(m1);

}}


