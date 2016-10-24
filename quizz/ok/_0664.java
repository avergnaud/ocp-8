package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

/* "execute 10 Runnable series" */
public class _0664 {

static void myRun() {
  out.println("hello");
}

public static void main(String... args) {

ExecutorService es = Executors.newFixedThreadPool(3);
try {
  IntStream.range(0,10).forEach(
    i->es.execute(_0664::myRun)
  );
} finally {
  es.shutdown();
}

}}
