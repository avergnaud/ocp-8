package quizz;

import static java.lang.System.out;
import java.util.stream.*;

public class _0634 {

public static void main(String... args) {

DoubleStream ds = DoubleStream.of(1,2,3);
Stream<Integer> is = ds.mapToInt(x->x);

}}

