package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

/* "execute 10 Runnable series" */

public class _0660 {

static void myRun() {
  out.println("hello");
}

public static void main(String... args) {

ExecutorService es = Executors.newSingleThreadExecutor();
try {
  for(int i=0;i<10;i++)
    es.execute(_0660::myRun);
} finally {
  es.shutdown();
}

}}
