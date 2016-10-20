package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

public class _0704 {

public static void main(String... args) {

/* current work dir is /home/ubuntu/dev/git/avergnaud/ocp-8 */
Path path = Paths.get(".");
try {
  out.println(path.normalize());
} catch(IOException e){out.println(e);}

try {
  out.println(path.toRealPath());
} catch(IOException e){out.println(e);}

}}
