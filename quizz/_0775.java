package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;
import java.util.concurrent.*;

public class _0775 {

static String myCall() {
	return "hello";
}

public static void main(String... args) {

Callable<String> c = _0775::myCall;

out.println(c.call());

}}
