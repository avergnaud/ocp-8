package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*
toRealPath
toAbsolutePath
getAbsolutePath
getCanonicalPath
*/
public class _0675 {

public static void main(String... args) {

Path thisPath = Paths.get("./quizz/_0675.java");
Path absolute = thisPath.toAbsolutePath();
Path real = null;
try {
  real = thisPath.toRealPath();
} catch(IOException e) {out.println(e);}
out.println(absolute.equals(real));
out.println(absolute);
out.println(real);
}}
