package quizz;

import static java.lang.System.out;

interface My implements AutoCloseable {
	public void close();
}

public class _0227 {

public static void main(String... args) {

try(My m = _0227::impl) {

}

}//end main

static void impl() {
	out.println("closing");
}

}


