package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

/*
StandardCopyOption
LinkOption
StandardOpenOption
*/

public class _0706 {

public static void main(String... args) {

/*
StandardCopyOption & LinkOption
static Path Files.copy(Path source,Path target,CopyOption... options) throws IOException
static long Files.copy(InputStream source, Path dest, CopyOption... options) throws IOException
static Path Files.move(Path source,Path dest,CopyOption... options) throws IOException
*/

/*
https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#copy-java.nio.file.Path-java.nio.file.Path-java.nio.file.CopyOption...-
b and c are not empty directories
*/
try {
Files.copy(Paths.get("b"),Paths.get("c"),StandardCopyOption.REPLACE_EXISTING);
} catch (IOException e) {
  out.println(e);
}


}}
