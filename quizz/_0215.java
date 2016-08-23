package quizz;

import java.io.*;
import java.time.*;
import java.time.format.*;
import static java.lang.System.out;

/* 25/12/2016 */
public class _0215 {

public static void main(String... args) {
	BufferedReader in = null;
	try {
		in = new BufferedReader(new FileReader("une_date.txt"));
		String dateString = in.readLine();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		LocalDate ld = LocalDate.parse(dateString, dtf);
		out.println(ld);
	} catch(IOException e) {
		e.printStackTrace();
	} catch(DateTimeParseException e) {
		e.printStackTrace();
	} finally {
		if(in != null) {
			try {
				in.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}//end if
	}//end finally

}//end main
}


