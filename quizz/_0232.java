package quizz;

import static java.lang.System.out;

class JammedTurkeyCage implements AutoCloseable {
public void close() throws IllegalStateException {
throw new IllegalStateException("cage door does not close");
}
}

public class _0232 {

public static void main(String... args) {

try(JammedTurkeyCage t = new JammedTurkeyCage()) {
throw new IllegalStateException("turkeys ran out !");
} catch(IllegalStateException e) {
out.println(e.getMessage());
for(Throwable t : e.getSuppressed()) {
out.println(t.getMessage());
}
}

}//end main

}


