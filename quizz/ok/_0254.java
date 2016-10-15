package quizz;

import static java.lang.System.out;

class Test<T> {
	Test(T t) {
		this.t = t;
	}
	T t;
	T get() {return t;}
}


public class _0254 {

static Test<?> meth1() {
	return new Test<String>("hello");
}

public static void main(String... args) {

Test<?> test = meth1();
out.println(test.get());

}}

