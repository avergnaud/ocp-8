package quizz;

import java.time.*;
import java.time.temporal.*;
import static java.lang.System.*;

public class _0110 {
public static void main(String... args) {

LocalTime lt = LocalTime.now();

lt = lt.plus(10,ChronoUnit.SECONDS);
lt = lt.plus(10,ChronoUnit.MILLIS);
lt = lt.plus(10,ChronoUnit.MICROS);
lt = lt.plus(10,ChronoUnit.NANOS);

lt = lt.plusSeconds(10);
lt = lt.plusMillis(10);
lt = lt.plusMicros(10);
lt = lt.plusNanos(10);

}
}