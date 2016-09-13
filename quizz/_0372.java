package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0372 {
public static void main( String[] args){

List<String> l = IntStream.range(0,20)
	.filter(i->i%3==0)
	.mapToObj(i->""+i)
	.collect(Collectors.toList());
out.println(l);

l = IntStream.range(0,20)
	.parallel()
	.filter(i->i%3==0)
	.mapToObj(i->""+i)
	.collect(Collectors.toList());
out.println(l);

}}


