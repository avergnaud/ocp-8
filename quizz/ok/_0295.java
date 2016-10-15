package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;
import java.io.*;

public class _0295 {

static int counter;

static Integer myTask() throws IOException {
throw new IOException("thrown from myTask!");
}

public static void main(String... args) {

ExecutorService es = null;
try {
es = Executors.newSingleThreadExecutor();
Future<Integer> result = es.submit(_0295::myTask);
out.println(result.get());
} catch (InterruptedException e) {
out.println("get interrupted " + e.getCause());
} catch (ExecutionException e) {
out.println("ExecutionException "  + e.getCause());
} finally {
if(es != null)
	es.shutdown();
}

}}
