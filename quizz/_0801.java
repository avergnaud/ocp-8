package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;

public class _0801 {

public static void main(String... args) {

BinaryOperator<String> bo = (s1,s2) -> s1+s2;
Map<Integer,String> m = new HashMap<>();
m.put(1,"one");

m.merge(1," and two", bo);

out.println(m);

}}
