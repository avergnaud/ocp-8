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
public class _0676 {

public static void main(String... args) {

Path thisPath = Paths.get("./quizz/_0676.java");
Path absolute = thisPath.toAbsolutePath();
Path absoluteNormalized = absolute.normalize();
Path real = null;
try {
  real = thisPath.toRealPath();
} catch(IOException e) {out.println(e);}
out.println(absoluteNormalized.equals(real));
out.println(absoluteNormalized);
out.println(real);
}}
