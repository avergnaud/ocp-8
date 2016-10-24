package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.io.*;

public class _05592 {
public static void main(String... args) {

ExecutorService service = Executors.newSingleThreadExecutor();
try {
service.execute(()->{Thread.sleep(10_000);});
} catch(InterruptedException e) {
  out.println("ok");
} finally {
service.shutdown();
}

}}
