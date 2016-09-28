package quizz;

import static java.lang.System.out;

public class _0540 {

static int i;

static class Lol {}

public static void main(String... args) {

out.println(new _0540().i);//instance reference access to static variable

//out.println(new _0540().new Lol());// ! error: qualified new of static class

out.println(new Lol());

out.println(new _0540.Lol());

out.println(Boolean.valueOf("lol"));

}}
