package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0338 {
public static void main(String... args) {

NavigableSet<Integer> mySet = new TreeSet<>();
mySet.add(new Integer(1));
mySet.add(new Integer(2));
mySet.add(new Integer(3));
mySet.add(new Integer(4));
mySet.add(new Integer(5));

out.println(mySet.lower(3));

out.println(mySet.ceiling(5));

}}
