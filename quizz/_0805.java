package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;

public class _0805 {

static Integer myApply(Integer i1, Integer i2) {
return i1 += i2;
}

public static void main(String... args) {

out.println(myApply(1,2));

BinaryOperator<Integer> bo = _0805::myApply;
out.println(bo.apply(1,2));

BinaryOperator<Integer> bo2 = (Integer i1,Integer i2) -> i2 += i1;
out.println(bo2.apply(1,2));

/*
mailto:feedback@whizlabs.com?bcc=support@whizlabs.com&subject=Feedback to author for Question No. 65 of Quiz : Practice Test I From Course : OCPJP 8 Practice Tests
*/

}}

