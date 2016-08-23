package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.format.*;

public class _0188 {

public static void main(String... args) {

ZoneId eur = ZoneId.of("Europe/Paris");

ZoneDateTime zdt = ZoneDateTime.of(
	LocalDate.now(),
	LocalTime.now(),
	eur);

out.println(zdt);

}
}


