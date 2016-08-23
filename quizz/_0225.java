package quizz;

import static java.lang.System.out;

interface MyF {
public void myM() throws Exception;
}

class Impl implements MyF {
	public void myM() {
		out.println("hello");
	}
}

public class _0225 {

public static void main(String... args) {

MyF first = new Impl();

first.myM();

}//end main
}


