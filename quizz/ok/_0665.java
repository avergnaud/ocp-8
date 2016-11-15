package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class _0665 {

static Integer myTask(int i) {
  return Integer.valueOf(i);
}

public static void main(String... args) {

ExecutorService es = Executors.newSingleThreadExecutor();
try {
  Future<?> f = es.submit(()->myTask(2));
} finally {
  es.shutdown();
}

}}
