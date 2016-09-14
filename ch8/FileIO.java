package ch8;

import static java.lang.System.out;
import java.io.*;

public class FileIO {
public static void main(String... args) {

File file = new File("ch8FileIO.txt");

try(FileOutputStream fos = new FileOutputStream(file)) {
fos.write("hello");
} catch(FileNotFoundException e) {
out.println(e);
}

}}
