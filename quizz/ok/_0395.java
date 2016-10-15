package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class _0395 {

public static void main( String[] args){

Map<Integer,Set<String>> withSet = Stream.of("jon","andrew","harvey","bil")
	.collect(Collectors.groupingBy(String::length,
					Collectors.toSet()));
out.println(withSet);

}}


