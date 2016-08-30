package quizz;

import static java.lang.System.out;

class One implements AutoCloseable {
public void close() throws NullPointerException {
throw new NullPointerException("NPE");
}
}

class Two implements AutoCloseable {
public void close() throws IllegalStateException {
throw new IllegalStateException("ISE");
}
}

public class _0237 {
public static void main(String... args) {

try(One one = new One();
Two two = new Two();) {
throw new ArrayIndexOutOfBoundsException("AIOOBE");
}
catch(ArrayIndexOutOfBoundsException e) {
	out.println(e.getMessage());
for(Throwable t : e.getSuppressed()) {
out.println(t.getMessage());
}
}

}//end main
}


