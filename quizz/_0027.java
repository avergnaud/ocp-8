package quizz;

import static java.lang.System.out;

enum Some {
a,b,c,f,e;

Some() {
out.println("hello");
}

}

enum Autre {
f,g,h;

public Autre() {
out.println("hello Autre");
}

}

public class _0027 {

public static void main(String... args) {
out.println(Some.a);
}

}
