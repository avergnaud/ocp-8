/*2016-01-01*/
package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.time.*;

public class _0576 {

public static void main(String... args) {

String dateS = null;

Path thisPath = Paths.get("quizz/_0576.java");
File thisFile = thisPath.toFile();
try(InputStreamReader isr = new InputStreamReader(
	new BufferedInputStream(
		new FileInputStream(thisFile)));) {

	char[] myChars = new char[14];
	for(int i=0;i<14;i++) {
		myChars[i] = (char)isr.read();
	}
	dateS = new String(myChars);
} catch(IOException e) {out.println(e);}

dateS = dateS.replace("/","").replace("*","");
out.println(dateS);
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
LocalDate ld = LocalDate.parse(dateS,dtf);

}}

