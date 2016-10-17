package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0683 {

public static void main(String... args) {

Path path = Paths.get("/temp/myapp/bin/../../file.txt");

out.println(path.isAbsolute());
out.println(path.toAbsolutePath());

}}
