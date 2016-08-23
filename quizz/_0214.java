package quizz;

import java.io.*;
import java.time.*;
import java.time.format.*;
import static java.lang.System.out;

/* 25/12/2016 */
public class _0214 {

public static void main(String... args) {
	BufferedReader in = null;
	try {
		in = new BufferedReader("une_date.txt");
		String dateString = in.readLine();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = (LocalDate)dtf.parse(dateString);
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


