package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.*;

public class _0762 {

public static void main(String... args) {

LocalTime first = LocalTime.of(11,0);
LocalTime then = LocalTime.of(14,30);

Duration d1 = Duration.between(first,then);
out.println(d1);

long l1 = ChronoUnit.HOURS.between(first,then);
out.println(l1);

long l2 = ChronoUnit.MINUTES.between(first,then);
out.println(l2);
}}
