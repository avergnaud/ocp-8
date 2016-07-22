package quizz;

import java.time.*;
import java.time.temporal.*;

public class _0141 {
public static void main(String... args) {

LocalDate ld = LocalDate.now();
ld = ld.plusMonths(1);
ld = ld.plus(ChronoUnit.MONTHS,1);
System.out.println(ld);
}}
