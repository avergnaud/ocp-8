package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class _0522 {
public static void main(String... args) throws IOException {

Path hello = Paths.get(".").resolve(Paths.get("quizz/_0520.java"));

out.println(Paths.isRegularFile(hello));

}}
