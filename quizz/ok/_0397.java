package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class _0397 {

public static void main( String[] args){

Map<Integer,String> tm1 = Stream.of("jon","andrew","harvey","bil")
	.collect(Collectors.toMap(String::length,Function.identity()));
out.println(tm1);

}}


