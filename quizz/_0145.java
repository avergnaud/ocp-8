package quizz;

import java.time.*;
import static java.lang.System.out;

public class _0145 {
public static void main(String... args) {

LocalTime lt = LocalTime.of(12,10);
lt = LocalTime.of(12,10,15);
lt = LocalTime.of(12,10,15,100);

LocalDateTime ldt = LocalDateTime.of(2016,1,1,12,10);
ldt = ldt.of(2016,1,1,12,10,15);
ldt = ldt.of(2016,1,1,12,10,15,100);
out.println(ldt);

ZoneId sp = ZoneId.of("America/Sao_Paulo");
ZonedDateTime zdt = ZonedDateTime.of(2016,1,1,12,10,15,sp);

}}
