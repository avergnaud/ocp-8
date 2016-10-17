package quizz;

import static java.lang.System.out;
import java.io.*;

public class _0668 {

public static void main(String... args) {

Console console = System.console();
PrintWriter pw = console.writer();
String line;
if((line=console.readLine()) != null) {
  pw.append(line);
}
pw.flush();

}}
