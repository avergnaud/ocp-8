package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.stream.*;
import java.util.*;

public class _0813 {

public static Object trackParticipants(int count) {
return new Object();
}

public static void viewWinners(Future<?> f) {
try {
System.out.println(f.get(100,TimeUnit.MILLISECONDS));
} catch (Exception e) {
System.out.println("No Winner");
}
}

public static void main(String... args) {

ExecutorService service = Executors.newSingleThreadExecutor();
final List<Future<?>> results = new ArrayList<Future<?>>();

IntStream.range(100,105)
.forEach(i -> results.add(
	service.submit(() -> trackParticipants(i))));

results.stream().forEach(f -> viewWinners(f));

service .shutdown();

}}

