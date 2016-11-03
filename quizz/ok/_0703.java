package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

public class _0703 {

public static void main(String... args) {

/* current work dir is /home/ubuntu/dev/git/avergnaud/ocp-8 */
Path path = Paths.get("nonexistant");

out.println(Files.isDirectory(path));

try {
  Files.isSameFile(path,Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/nonexistant"));
} catch(IOException e) {out.println(e);}

}}
