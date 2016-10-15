package quizz;

import static java.lang.System.out;
import java.util.stream.*;

public class _0636 {

public static void main(String... args) {

DoubleStream ds = DoubleStream.of(1,2,3);
IntStream is = ds.mapToInt(x->(int)x);

}}

