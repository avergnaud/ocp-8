package ch5;

import static java.lang.System.out;
import java.time.*;

public class SomePeriods {
public static void main(String... args) {

Period deuxSemaines = Period.ofWeeks(2);
LocalDate dansDeuxSemaines = LocalDate.now().plus(deuxSemaines);
out.println(dansDeuxSemaines);

}}