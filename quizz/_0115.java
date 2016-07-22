package quizz;

import static java.lang.System.*;
import java.time.*;
import java.time.temporal.*;

public class _0115 {

public static void main(String... args) {

LocalDate day1 = LocalDate.of(2016,Month.JUNE, 10);
Period p = Period.of(0,0,2);
out.println(day1.plus(p));

LocalTime someTime = LocalTime.of(11,20);
Duration d = Duration.of(0,5);
out.println(someTime.plus(d));

}
}
