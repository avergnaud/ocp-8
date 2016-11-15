package quizz;

import static java.lang.System.out;

public class _0825 {

public static void main(String... args) {

try {
throw new NullPointerException("first");
} finally {
throw new NullPointerException("second");
}

}}

