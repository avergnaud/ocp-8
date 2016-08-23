package quizz;

import static java.lang.System.out;

public class _0228 {

public static void main(String... args) {

try(AutoCloseable a = _0228::impl) {

} catch(Exception e) {
out.println("hi");
}

}//end main

static void impl() {
	out.println("closing");
}

}


