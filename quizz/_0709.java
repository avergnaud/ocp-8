package quizz;

import static java.lang.System.out;

interface My {
  default void test() {out.println("hi");}
}

class L implements My {}


public class _0709 {

public static void main(String... args) {

L l = new L();
l.test();

}}
