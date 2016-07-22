package quizz;

import java.time.*;

public class _0139 {
public static void main(String... args) {

LocalDate ld = LocalDate.now();
ld = ld.plusMonths(1);
ld = ld.plus(1,ChronoUnit.MONTHS);
System.out.println(ld);
}}
