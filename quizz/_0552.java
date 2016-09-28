package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class _0552 {

public static void main(String... args) {

UnaryOperator<String> uo = "hello"::concat;

out.println(uo.apply(" world"));

BinaryOperator<String> bo = String::concat;

out.println(bo.apply("hello"," world"));

BiConsumer<String,String> bc = String::concat;

bc.accept("hello ", "world");//'void' type not allowed for println(void)

}}
