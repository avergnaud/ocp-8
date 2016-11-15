package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

/*
exécutées dans le même ordre ?
ou retournées dans le même ordre ?
*/

public class _0827 {

static String myCall(String input) {
out.println("calling " + input);
return input;
}

public static void main(String... args) {

List<Callable<String>> liste = new ArrayList<>();
liste.add(()-> myCall("first"));
liste.add(()-> myCall("second"));
liste.add(()-> myCall("third"));
liste.add(()-> myCall("fourth"));
liste.add(()-> myCall("fifth"));

ExecutorService es = Executors.newCachedThreadPool();
List<Future<String>> retours = null;
try {

retours = es.invokeAll(liste);

} catch(InterruptedException e) {
out.println(e); 
}finally {
es.shutdown();
}

try {
for(Future f : retours) {
out.println(f.get());
}
} catch(InterruptedException | ExecutionException e) {
out.println(e);
}

}}

