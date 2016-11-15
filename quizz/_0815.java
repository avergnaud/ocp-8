package quizz;

import static java.lang.System.out;
import java.time.temporal.*;
import java.time.*;

public class _0815 {

public static void main(String... args) {

LocalDate ld1 = LocalDate.of(2016,Month.APRIL,2);
LocalDate ld2 = LocalDate.of(2016,Month.OCTOBER,9);

long l = ChronoUnit.DAYS.between(ld1,ld2);

out.println(l);

//Duration d = Duration.of(1,ChronoUnit.WEEKS);

}}

