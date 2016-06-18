package ch5;

import java.time.*;
import static java.lang.System.out;

public class TZperiods {
public static void main(String... args) {

out.println(ZonedDateTime.now());

ZoneId zoneId = ZoneId.of("UTC+1");

ZonedDateTime first = ZonedDateTime.of(LocalDateTime.now(),zoneId);
out.println(first);

/*https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html*/


ZonedDateTime also = ZonedDateTime.of(LocalDateTime.now(),zoneId.normalized());
out.println(also);

ZoneId z2 = ZoneId.of("Asia/Shanghai");

ZonedDateTime third = ZonedDateTime.of(LocalDateTime.now(),z2);
out.println(third);

}}