package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*assume copie_une_date.txt does not exist*/
public class _0482 {
	public static void main(String... args) {
		
		try(InputStream is = new FileInputStream("une_date.txt")) {
			Files.copy(is,Paths.get("copie_une_date.txt"));
		} catch (IOException e) {
			out.println(e);
		}
		
	}
}