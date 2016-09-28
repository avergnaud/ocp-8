package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0554 {

private static final long MAX = 1_000_000;

public static void main( String[] args){

Long somme = LongStream.rangeClosed(0,MAX)
        .collect(Collectors.summingLong(l->l));

}}


