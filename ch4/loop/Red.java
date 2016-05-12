package ch4.loop;

import java.util.*;
import static java.lang.System.out;

public class Red {
public static void main(String... args) {

// write reduction to multiply all integers in a stream

// classical
List<Integer> first = Arrays.asList(1,2,3,4,5,6,7);
Integer result = 1;
for(Integer i : first) {
	result = result*i;
}
out.println(result);

// new
Integer secondRes = first.stream().reduce(1,(j,k)->j*k);
out.println(secondRes);

}}