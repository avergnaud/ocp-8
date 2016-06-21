package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.*;

public class _0098 {
public static void main(String... args) {

LocalDate d1 = LocalDate.now();
LocalDate d2 = d1.plusDays(1);
long diff = d1.until(d2,ChronoUnit.Days);
out.println(diff);

diff = ChronoUnit.Days.between(d1,d2);
out.println(diff);

}
}