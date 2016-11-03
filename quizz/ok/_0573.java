package quizz;

import static java.lang.System.out;
import java.nio.file.*;

public class _0573 {

public static void main(String... args) {

Path a = Paths.get("a");
Path b = Paths.get("b");
out.println(a.resolve(b));
out.println(a.relativize(a.resolve(b)));

}}

