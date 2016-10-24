package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.function.*;

class A {
  void test() {out.println("1");}
  static void test(A a) {out.println("2");}
}

public class _0715 {

public static void main(String... args) {

Consumer<A> consumer = A::test;

}}
