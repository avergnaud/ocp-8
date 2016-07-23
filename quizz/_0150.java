package quizz;

import java.time.*;
import java.time.temporal.*;
import static java.lang.System.out;

public class _0150 {
public static void main(String... args) {

Instant origin = Instant.ofEpochSecond(0);
out.println(origin);

origin = origin.plus(1,ChronoUnit.DAYS);
out.println(origin);

origin = origin.plus(500,ChronoUnit.MICROS);
out.println(origin);

origin = origin.plus(1,ChronoUnit.MONTHS);
out.println(origin);

}}
