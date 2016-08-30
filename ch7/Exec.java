package ch7;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

public class Exec {

static int jobCounter = 0;

static void job() {
String j = "job"+jobCounter++;
for(int i=0;i<5;i++) {
out.println(j + " : " + i);
}
}

public static void main(String... args) {

ExecutorService es = null;
try {
es = Executors.newSingleThreadExecutor();
for(int j=0;j<3;j++) {
es.execute(Exec::job);
}

} finally {
List<Runnable> remaining = es.shutdownNow();
out.println(remaining);
}

}}
