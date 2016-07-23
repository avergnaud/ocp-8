package ch5;

import java.time.*;
import static java.lang.System.out;

public class HeureEte {
public static void main(String... args) {
//26 mars 2016
//25 mars 2017

ZoneId paris = ZoneId.of("Europe/Paris");
LocalDate j = LocalDate.of(2016,Month.MARCH,27);
LocalTime avantLt = LocalTime.of(1,30);
LocalTime apresLt = LocalTime.of(2,30);

ZonedDateTime avant = ZonedDateTime.of(j,avantLt,paris);
ZonedDateTime apres = ZonedDateTime.of(j,apresLt,paris);
ZonedDateTime plus1 = avant.plusHours(1);

out.println(avant);
out.println(apres);
out.println(plus1);

}}