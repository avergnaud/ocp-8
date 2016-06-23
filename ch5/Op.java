package ch5;

import java.time.*;
import java.time.temporal.*;
import static java.lang.System.*;

public class Op {
public static void main(String... args) {

LocalDate now = LocalDate.now();
//1
now = now.plusDays(1);
//2
now = now.plus(1,ChronoUnit.DAYS);
//3
Period oneDay = Period.ofDays(1);
now = now.plus(oneDay);
//4
oneDay = Period.of(0,0,1);
now = now.plus(oneDay);
//out.println(now);

LocalTime lt = LocalTime.now();
//1
lt = lt.plusMinutes(1);
//2
lt = lt.plus(1,ChronoUnit.MINUTES);
//3
Duration d = Duration.ofMinutes(1);
lt = lt.plus(d);
//4
d = Duration.of(60, ChronoUnit.SECONDS);
lt = lt.plus(d);
out.println(lt);

lt = lt.plusNanos(5_000_000);
out.println(lt);

}}

//9 Equipement et configuration