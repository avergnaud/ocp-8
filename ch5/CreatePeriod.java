package ch5;

import java.time.*;
import static java.lang.System.out;

public class CreatePeriod {
public static void main(String... args) {

//5 ways
Period first = Period.of(1,1,1);
Period second = Period.ofYears(1);
Period third = Period.ofMonths(1);
Period fourth = Period.ofWeeks(1);
Period fifth = Period.ofDays(1);
out.println(first);//P1Y1M1D
out.println(second);//P1Y
out.println(third);//P1M
out.println(fourth);//P7D
out.println(fifth);//P1D

}}
