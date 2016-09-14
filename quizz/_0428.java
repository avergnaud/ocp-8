package quizz;

import static java.lang.System.out;
import java.io.*;

public class _0428 {
public static void main(String... args) {

File file = new File("ch8Print.txt");

PrintWriter writer = null;
try {
writer = new PrintWriter(file);
writer.println("hello");
writer.println(42);
} catch (FileNotFoundException e) {
out.printf("FileNotFoundException %s%n",e);
}

}}
