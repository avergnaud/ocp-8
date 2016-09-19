package ch9;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class FilesTest {
public static void main(String... args) {

try {

Files.createDirectory(Paths.get("C:\\tmp"));

} catch(IOException e) {
out.println(e);//already exists
}

try(BufferedWriter bw = Files.newBufferedWriter(
	Paths.get("C:\\tmp\\hello.txt"))) {

bw.write("hello");

} catch(IOException e) {
out.println(e);
}

}}