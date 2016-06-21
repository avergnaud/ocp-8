package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.*;

public class _0101 {
public static void main(String... args) {

	ZoneId zone = ZoneId.of("Europe/London");
        // At 2015-03-29T01:00:00Z, Europe/London goes from UTC+0 to UTC+1
        LocalDate transitionDate = LocalDate.of(2015, 3, 29);
        ZonedDateTime start = ZonedDateTime.of(transitionDate, LocalTime.MIDNIGHT, zone);
        ZonedDateTime endWithDuration = start.plus(Duration.ofDays(1));
        ZonedDateTime endWithPeriod = start.plus(Period.ofDays(1));
        System.out.println(endWithDuration); 
        System.out.println(endWithPeriod);   

}
}