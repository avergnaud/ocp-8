package quizz;

import java.time.*;
import java.time.temporal.*;
import static java.lang.System.*;

public class _0108 {
public static void main(String... args) {

LocalDate now = LocalDate.now();
now = now.plusDays(1);
now = now.plus(ChronoUnit.DAYS,1);
out.println(now);

}
}