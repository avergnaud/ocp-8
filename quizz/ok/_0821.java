package quizz;

import static java.lang.System.out;


interface Parent {
public static final int i = 1;
public static /*final*/ int get() {return 1;}
}

public class _0821 implements Parent {

public static void main(String... args) {
//
out.println(i);
//out.println(get());
//
_0821 a = new _0821();
out.println(a.i);
//out.println(a.get());
//
out.println(_0821.i);
//out.println(_0821.get());

out.println(Parent.get());
}}

