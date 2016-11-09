package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;

public class _0806 {

public static void main(String... args) {

UnaryOperator<Double> up = d -> d+2;
UnaryOperator<Double> up2 = d -> d+3;
Function<Double,Double> up3 = up.compose(up2);
out.println(up3.apply(2.1));

}}

