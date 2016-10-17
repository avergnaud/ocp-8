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
public class _0679 {

public static void main(String... args) {

File file = new File("quizz/NONEXISTANT");
String abs = file.getAbsolutePath();
String can = null;
try {
  can = file.getCanonicalPath();
} catch(IOException e){out.println(e);}

out.println(abs);
out.println(can);

}}
