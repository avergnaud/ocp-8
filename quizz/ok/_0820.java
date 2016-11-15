package quizz;

import static java.lang.System.out;


class Parent {
public static final int i = 1;
public static final int get() {return 1;}
}

public class _0820 extends Parent {

public static void main(String... args) {
//
out.println(i);
out.println(get());
//
_0820 a = new _0820();
out.println(a.i);
out.println(a.get());
//
out.println(_0820.i);
out.println(_0820.get());
}}

