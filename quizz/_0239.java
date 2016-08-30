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

public class _0239 {
public static void main(String... args) {

try(One one = new One();
Two two = new Two();) {
throw new ArrayIndexOutOfBoundsException("AIOOBE");
}
finally {
throw new NumberFormatException("NFE");
}

}//end main
}


