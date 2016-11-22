package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.util.stream.*;
import java.io.*;

public class _0856 {

public static void main(String... args) throws IOException {

Stream<Path> sp = Files.walk(Paths.get("/i/dont/exist"),0);

out.println(sp.count());

}}

