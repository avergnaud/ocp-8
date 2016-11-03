package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;
import java.util.concurrent.*;

public class _0772 {

static String myCall() throws Exception {
	return "hello";
}

public static void main(String... args) {

ExecutorService es = Executors.newSingleThreadExecutor();

es.submit(_0772::myCall);

es.shutdown();

}}
