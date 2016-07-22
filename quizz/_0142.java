package quizz;

import java.time.*;
import java.time.temporal.*;

public class _0142 {
public static void main(String... args) {

LocalDate ld = LocalDate.of(2016,Month.JULY,21);
ld = ld.plusMonths(1);
ld = ld.plus(1,ChronoUnit.MONTHS);
ld = ld.plus(Period.of(0,1,0));
ld = ld.plus(Period.of(0,1,0));
ld = ld.plus(Period.ofMonths(1));
System.out.println(ld);
}}
