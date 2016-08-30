package ch7;

import java.util.concurrent.*;
import static java.lang.System.out;
import java.io.*;

public class Calls3 {

public static void main(String... args) {

Callable<Integer> task = () -> {
throw new IOException();
//return 1+2;
};

ExecutorService executor = Executors.newSingleThreadExecutor();
try {
Future<Integer> future = executor.submit(task);

out.println(future.get());

} catch(InterruptedException e) {
//because future.get() is blocking
} catch(ExecutionException e) {
out.println("ExecutionException " + e.getCause());
} finally {
executor.shutdown();
}

}
}
