package ch7;

import java.util.concurrent.*;
import static java.lang.System.out;
import java.io.*;

public class Calls2 {

static Integer call() throws IOException {
return 1;
}


public static void main(String... args) {

ExecutorService es = Executors.newSingleThreadExecutor();
try {

Future<Integer> res = es.submit(Calls2::call);

out.println(res.get());

} catch(InterruptedException | ExecutionException e) {

} finally {
es.shutdown();
}

}
}
