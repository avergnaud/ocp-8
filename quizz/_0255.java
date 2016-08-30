package quizz;

import static java.lang.System.out;

class Test<T> {
	Test(T t) {
		this.t = t;
	}
	T t;
	T get() {return t;}
}


public class _0255 {

static <T> Test<T> meth2(T some) {
	return new Test(some);
}

public static void main(String... args) {

Test<Integer> resultat = _0255.<Integer>meth2(new Integer(1));
out.println(resultat.get());

}}

