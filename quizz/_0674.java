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
public class _0674 {

public static void main(String... args) {

Path thisPath = Paths.get("./quizz/_0674.java");
Path real = thisPath.toRealPath();
Path absolute = thisPath.toAbsolutePath();
out.println(real.equals(absolute));

}}
