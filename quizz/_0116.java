package quizz;

import static java.lang.System.*;
import java.time.*;
import java.time.temporal.*;

public class _0116 {

public static void main(String... args) {

LocalDate day1 = LocalDate.of(2016,ChronoUnit.MONTHS.JUNE, 10);
Period p = Period.of(0,0,3);
out.println(day1.plus(p));
}
}
