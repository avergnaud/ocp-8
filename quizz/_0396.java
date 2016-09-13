package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class _0396 {

public static void main( String[] args){

Map<String,Integer> tm1 = Stream.of("jon","andrew","harvey","bil")
	.toMap(Function.identity(),String::length);
out.println(tm1);

}}


