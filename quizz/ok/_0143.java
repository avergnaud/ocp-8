package quizz;

import java.time.*;

public class _0143 {
public static void main(String... args) {

LocalDate ld = LocalDate.of(2016,Month.JULY,21);
ld = ld.plus(Duration.ofDays(1));
System.out.println(ld);
}}
