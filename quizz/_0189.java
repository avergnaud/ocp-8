package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.format.*;

public class _0189 {

public static void main(String... args) {

ZoneId eur = ZoneId.of("Europe/Paris");

ZonedDateTime zdt = ZonedDateTime.of(
	LocalDate.now(),
	LocalTime.now(),
	eur);

out.println(zdt);//assume 2016-08-19T17:44:25.897+02:00[Europe/Paris]

DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATETIME;

out.println(zdt.format(dtf));

}
}


