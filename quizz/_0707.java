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

public class _0707 {

public static void main(String... args) {

/*
StandardCopyOption & LinkOption
static Path Files.copy(Path source,Path target,CopyOption... options) throws IOException
static long Files.copy(InputStream source, Path dest, CopyOption... options) throws IOException
static Path Files.move(Path source,Path dest,CopyOption... options) throws IOException
*/

/*
https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#move-java.nio.file.Path-java.nio.file.Path-java.nio.file.CopyOption...-
"b" is a non empty directory. "d" does not exist
*/
try {
Files.move(Paths.get("b"),Paths.get("d"),StandardCopyOption.REPLACE_EXISTING);
} catch (IOException e) {
  out.println(e);
}


}}
