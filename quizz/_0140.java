package quizz;

import java.time.*;
import java.time.temporal.*;

public class _0140 {
public static void main(String... args) {

LocalDate ld = LocalDate.now();
ld = ld.plusMonths(1);
ld = ld.plus(1,ChronoUnits.MONTH);
System.out.println(ld);
}}
