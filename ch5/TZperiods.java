package ch5;

import java.time.*;
import static java.lang.System.out;

/*https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html#SHORT_IDS*/
public class TZperiods {

public static void main(String... args) {

/*1*/
out.println(ZonedDateTime.now());
ZoneId z2 = ZoneId.of("Asia/Shanghai");
ZonedDateTime third = ZonedDateTime.of(LocalDateTime.now(z2),z2);
out.println(third);
out.println();

/*2*/
out.println(ZonedDateTime.now());
ZoneId z3 = ZoneId.of("Africa/Harare");
ZonedDateTime zd3 = ZonedDateTime.of(LocalDateTime.now(z3),z3);
out.println(zd3);
out.println();

/*3*/
out.println(ZonedDateTime.now());
ZoneId z4 = ZoneId.of("America/Chicago");
ZonedDateTime zd4 = ZonedDateTime.of(LocalDateTime.now(z4),z4).minusHours(1);
out.println(zd4);
out.println();
long l = ZonedDateTime.now().until(zd4,java.time.temporal.ChronoUnit.HOURS);
//out.println(l);

/*4*/
ZoneId z5 = ZoneId.of("Asia/Karachi");
ZonedDateTime zd5 = ZonedDateTime.of(LocalDateTime.now(z5),z5).plusHours(1);
out.println(zd5);
ZoneId z6 = ZoneId.of("Pacific/Auckland");
ZonedDateTime zd6 = ZonedDateTime.of(LocalDateTime.now(z6),z6).minusHours(3);
out.println(zd6);
out.println();
long l2 = zd5.until(zd6,java.time.temporal.ChronoUnit.HOURS);
//out.println(l);
}}