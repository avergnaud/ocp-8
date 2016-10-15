package quizz;

import static java.lang.System.out;

class JammedTurkeyCage implements AutoCloseable {
public void close() throws IllegalStateException {
out.println("abc");
throw new IllegalStateException("cage door does not close");
}
}

public class _0234 {

public static void main(String... args) {

try(JammedTurkeyCage t = new JammedTurkeyCage()) {
throw new RuntimeException("turkeys ran out !");
} catch(IllegalStateException e) {
out.println("in catch clause");
out.println(e.getMessage());
for(Throwable t : e.getSuppressed()) {
out.println(t.getMessage());
}
}

}//end main

}


