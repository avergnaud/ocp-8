package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.stream.*;
import java.util.*;


public class _0413 {

static Stream<String> getStream() {
return Stream.of("","Isaac","Henri","Karl","Albert","Jon Jon","Pierre","Serge");
}

public static void main( String[] args){

Map<Integer,List<String>> map = getStream()
	.groupingBy(String::length);
out.println(map);

}}


