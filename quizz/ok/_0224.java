package quizz;

import static java.lang.System.out;

interface MyF {
public void myM() throws Exception;
}

public class _0224 {

public static void main(String... args) {

MyF first = new MyF() {
	public void myM() {
		out.println("hello");
	}
};

first.myM();

}//end main
}


