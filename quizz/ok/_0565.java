package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

public class _0565 {

static void failing() throws NullPointerException {
throw new NullPointerException("could not complete task");
}

public static void main(String... args) {

Runnable failing = _0565::failing;

ExecutorService executor = Executors.newSingleThreadExecutor();
try {

executor.execute(failing);

} finally {
executor.shutdown();
}

out.println("HELLO FROM MAIN");

}}

