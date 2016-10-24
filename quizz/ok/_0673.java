package quizz;

import static java.lang.System.out;
import java.nio.file.*;

public class _0673 {

public static void main(String... args) {

Path path = Paths.get("/user/.././root","../azert.txt");
out.println(path);
out.println(path.normalize());
Path lion = Paths.get("/lion");
out.println(path.normalize().relativize(lion));

}}
