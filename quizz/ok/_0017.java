package quizz;

import static java.lang.System.out;

interface A {}

class B {}

class _0017 {
public static void main(String... args) {

B b = new B();
A a = (A)b;

String s = "same";
a = (A)s;

}
}
