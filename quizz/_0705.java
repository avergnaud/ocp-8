package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

public class _0705 {

public static void main(String... args) {

/* current work dir is /home/ubuntu/dev/git/avergnaud/ocp-8 */
Path path = Paths.get("");

//out.println(path.normalize());

try {
  out.println(path.toRealPath());
} catch(IOException e){out.println(e);}

}}
