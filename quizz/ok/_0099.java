package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.*;

public class _0099 {
public static void main(String... args) {

LocalDate d1 = LocalDate.now();
LocalDateTime dt2 = d1.plusDays(1);
long diff = d1.until(dt2,ChronoUnit.DAYS);
out.println(diff);

}
}