package ch5;

import java.time.*;
import static java.lang.System.out;

public class HeureHiver {
public static void main(String... args) {

//nuit du 29 au 30 Octobre 2016, à 3H il sera 2H -> heure hiver

ZoneId paris = ZoneId.of("Europe/Paris");
ZonedDateTime zdt = ZonedDateTime.of(
	LocalDate.of(2016,Month.OCTOBER,30),
	LocalTime.of(2,30),
	paris);

out.println(zdt);//2016-10-30T02:30+02:00[Europe/Paris]

zdt = zdt.plusHours(1);

out.println(zdt);//2016-10-30T02:30+01:00[Europe/Paris]

}}