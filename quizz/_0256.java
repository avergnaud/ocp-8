package quizz;

import static java.lang.System.out;

class Test<T> {
	Test(T t) {
		this.t = t;
	}
	T t;
	T get() {return t;}
}


public class _0256 {

static <T> Test<T> meth2(T some) {
	return new Test<T>(some);
}

public static void main(String... args) {

Test<Integer> resultat = meth2(new Integer(1));
out.println(resultat.get());

}}

