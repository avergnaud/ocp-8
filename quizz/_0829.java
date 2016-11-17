package quizz;

import static java.lang.System.out;
import java.io.*;

public class _0829 {

public static void main(String... args) {

try {
byte[] hello = "hello world\n".getBytes();

out.write(hello);

} catch(IOException e) {
out.println(e);
}

}}

