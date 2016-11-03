package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.net.*;

public class _0776 {

public static void main(String... args) {

Path thisP = Paths.get("quizz/_0776.java");
URI uri = thisP.toUri();
out.println(uri);
out.println(Paths.get(uri));
Path abs = thisP.toAbsolutePath();
out.println(abs);
}}
