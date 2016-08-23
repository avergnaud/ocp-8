package quizz;

import java.io.*;
import java.time.*;
import java.time.format.*;
import static java.lang.System.out;

/* 25/12/2016 */
public class _0216 {

public static void main(String... args) {
	try-with-resource(BufferedReader in = new BufferedReader(new FileReader("une_date.txt"));) {
		String dateString = in.readLine();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(dateString, dtf);
		out.println(ld);
	} catch(IOException | DateTimeParseException e) {
		e.printStackTrace();
	}

}//end main
}


