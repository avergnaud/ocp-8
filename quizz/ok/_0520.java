package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class _0520 {
public static void main(String... args) throws IOException {

Path hello = Paths.get(".").resolve(Paths.get("quizz/_0520.java"));

Files.lines(hello).forEach(out::println);

}}
