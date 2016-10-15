package quizz;

import static java.lang.System.out;

class JammedTurkeyCage implements AutoCloseable {
String s;
JammedTurkeyCage(String s) {this.s=s;}
public void close() throws IllegalStateException {
throw new IllegalStateException(s);
}
}

public class _0235 {

public static void main(String... args) {

try(
JammedTurkeyCage t1 = new JammedTurkeyCage("t1");
JammedTurkeyCage t2 = new JammedTurkeyCage("t2");
JammedTurkeyCage t3 = new JammedTurkeyCage("t3");
) {} catch(IllegalStateException e) {
out.println(e.getMessage());
for(Throwable t : e.getSuppressed()) {
out.println(t.getMessage());
}
}

}//end main

}


