package quizz;

import static java.lang.System.out;
import java.util.function.*;

public class _0854 {

public static void main(String... args) {

Function<Integer,Integer> f1 = x -> x+=x;
IntFunction<Integer> f2 = x -> x+=x;
ToIntFunction<Integer> f3 = x -> x+=x;

UnaryOperator<Integer> b1 = x -> x+=x;
IntUnaryOperator b2 = x -> x+=x;

Consumer<Integer> c1 = x -> x+=x;
IntConsumer c2 = x -> x+=x;

}}

