package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.*;

/*
compile ?
compile + warning ?
exec ?
*/
public class _0088 {
public static void main(String... args) {

LocalDate now = LocalDate.now();
Period p = Period.ofWeeks(10).ofDays(1);
LocalDate then = now.plus(p);
out.println(now.until(then,ChronoUnit.DAYS));

}
}