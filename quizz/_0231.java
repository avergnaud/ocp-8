package quizz;

import static java.lang.System.out;

public class _0231 {

public static void main(String... args) {

try(AutoCloseable a = ()->{throw new IllegalStateException("hello");}) {
throw new IllegalStateException("world");
} catch(IllegalStateException e) {
out.println(e.getMessage());
for(Throwable t : e.getSuppressed()) {
out.println(t.getMessage());
}
}

}//end main

}


