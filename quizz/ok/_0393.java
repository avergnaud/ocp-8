package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class _0393 {

public static void main( String[] args){

Stream<Integer> someStream = Stream.iterate(0,i->++i).limit(100);

int nb = someStream.collect(Collectors.counting());

out.println(nb);

}}


