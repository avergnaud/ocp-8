package ch6;

import static java.lang.System.out;

public class Re {
public static void main(String... args) {

try(AutoCloseable a = ()->{throw new Exception("hello");}) {
throw new Exception("world");
} catch(Exception e) {
out.println(e.getMessage());
for(Throwable t : e.getSuppressed()) {
out.println(t.getMessage());
}
}


}}
