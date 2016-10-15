/*2016-01-01*/
package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0575 {

public static void main(String... args) {

Path thisPath = Paths.get("quizz/_0575.java");
File thisFile = thisPath.toFile();
try(InputStreamReader isr = new InputStreamReader(
	new BufferedInputStream(
		new FileInputStream(thisFile)));) {

char[] myChars = new char[14];
for(int i=0;i<14;i++) {
	myChars[i] = isr.read();
}
out.println(new String(myChars));

} catch(IOException e) {out.println(e);}

}}

