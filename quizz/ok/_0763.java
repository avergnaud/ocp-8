package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.*;

public class _0763 {

public static void main(String... args) {

LocalDateTime ldt = LocalDateTime.of(2016,Month.OCTOBER,28,14,23);
Duration d = Duration.of(1,ChronoUnit.HOURS);
ldt = ldt.plus(d);
ldt = ldt.plus(1,ChronoUnit.HOURS);
ldt = ldt.plusHours(1);
out.println(ldt);

}}
