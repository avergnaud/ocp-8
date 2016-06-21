package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.*;

public class _0102 {
public static void main(String... args) {

	LocalDate n = LocalDate.now().plus(Period.ofWeeks(1));
	out.println(n);  

	LocalTime lt = LocalTime.now().plus(Duration.ofNanos(1_000_000));
	out.println(lt);

	LocalDateTime ldt = LocalDateTime.now().plus(Period.of(1,ChronoUnit.DECADES));
	out.println(ldt);
}
}