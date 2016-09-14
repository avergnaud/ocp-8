package quizz;

import static java.lang.System.out;
import java.io.*;

/*
assume /home/ubuntu/ch8Print.txt exists
/home/ubuntu/dev/git/avergnaud/ocp-8>javac quizz/_0429.java
/home/ubuntu>java -cp /home/ubuntu/dev/git/avergnaud/ocp-8 quizz._0429
*/
public class _0429 {
public static void main(String... args) {

File file = new File("ch8Print.txt");
out.println(file.exists());

}}
