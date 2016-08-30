package ch7;

import java.util.concurrent.*;
import static java.lang.System.out;
import java.io.*;

public class Calls4 {

static Integer someTask() throws InterruptedException {
Thread.sleep(5000);
out.println("job done");
return 1;
}

public static void main(String... args) {

ExecutorService executor = Executors.newSingleThreadExecutor();

try {

Future<Integer> future = executor.submit(Calls4::someTask);

} finally {
executor.shutdown();
}

}
}
