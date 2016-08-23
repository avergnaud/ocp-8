package ch6;

import static java.lang.System.out;

class SomeResource implements AutoCloseable {

public void close() {
out.println("closing");
}

}

public class Auto {
public static void main(String... args) {

try(SomeResource sr = new SomeResource();) {

}

}

}
