package ch6;

import java.io.*;
import java.time.*;
import java.time.format.*;
import static java.lang.System.out;

/* 25/12/2016 */
public class Then {
public static void main(String... args) {
	BufferedReader in = null;
	try {
		in = new BufferedReader(new FileReader("une_date.txt"));
		String dateString = in.readLine();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(dateString, dtf);
		out.println(ld);
	} catch(IOException | DateTimeParseException e) {
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
}// end class
