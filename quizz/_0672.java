package quizz;

import static java.lang.System.out;
import java.nio.file.*;

public class _0672 {

public static void main(String... args) {

Path path = Paths.get("/user/.././root","../azert.txt");
out.println(path);
out.println(path.normalize());
out.println(path.normalize().relativize("/lion"));

}}
