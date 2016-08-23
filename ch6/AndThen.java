package ch6;

import java.io.*;
import java.time.*;
import java.time.format.*;
import static java.lang.System.out;

/* 25/12/2016 */
public class AndThen {
public static void main(String... args) {
	//BufferedReader in = null;
	//try-with-resource(in = new BufferedReader(new FileReader("une_date.txt"));) {
	//try(in = new BufferedReader(new FileReader("une_date.txt"));) {
	try(BufferedReader in = new BufferedReader(new FileReader("une_date.txt"));) {
		String dateString = in.readLine();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(dateString, dtf);
		out.println(ld);
	} catch(IOException | DateTimeParseException e) {
		e.printStackTrace();
	}

}//end main
}// end class
