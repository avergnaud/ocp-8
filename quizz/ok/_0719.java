package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

class A {int i;public A(int i) {this.i=i;}public String toString(){return "A"+i;}}

public class _0719 {

public static void main(String... args) {

Comparator<A> comp = (a,b) -> a.i - b.i;

Stream.of(new A(5),new A(2),new A(4))
  .sorted()
  .forEach(out::println);

}}
