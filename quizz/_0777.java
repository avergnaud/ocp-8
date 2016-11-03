package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.net.*;
import java.io.*;

public class _0777 {

public static void main(String... args) {


File ocp8 = new File(".");

try {
out.println(ocp8.getCanonicalPath());
} catch(IOException e) {out.println(e);}

File[] files = ocp8.listFiles();
for(File f : files) out.println(f);

}}
