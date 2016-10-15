package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

public class _0567 {

static void failing() throws NullPointerException {
throw new NullPointerException("fail");
}

public static void main(String... args) {

Runnable failing = _0265::failing;

ExecutorService executor = Executors.newSingleThreadExecutor();
try {

Future<?> f = executor.submit(failing);

f.get();

} catch(InterruptedException e) {
//bad
} catch(ExecutionException e) {
out.println(e + " " + e.getCause());
} finally {
executor.shutdown();
}

out.println("HELLO FROM MAIN");

}}

