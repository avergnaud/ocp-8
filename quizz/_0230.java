package quizz;

import static java.lang.System.out;

public class _0230 {

public static void main(String... args) {

try(AutoCloseable a = ()->throw new Exception("hi")) {

} catch(Exception e) {
out.println(e.getMessage());
}

}//end main

}


