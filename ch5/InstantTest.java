package ch5;

import java.time.Instant;
import static java.lang.System.out;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class InstantTest {
public static void main(String... args) {

Instant now = Instant.now();

ZoneId saopaulo = ZoneId.of("America/Sao_Paulo");
ZonedDateTime zdt = ZonedDateTime.of(2016,1,20,10,0,0,0,saopaulo);
Instant another = zdt.toInstant();

long l = now.toEpochMilli();

Instant origin = Instant.ofEpochSecond(0);
out.println(origin);

origin = origin.plus(1,ChronoUnit.DAYS);
out.println(origin);

origin = origin.plus(500,ChronoUnit.MICROS);
out.println(origin);

origin = origin.plus(1,ChronoUnit.MONTHS);
out.println(origin);


}}
//