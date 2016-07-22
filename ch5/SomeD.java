package ch5;

import java.time.Duration;
import java.time.LocalTime;
import static java.lang.System.out;

public class SomeD {
public static void main(String... args) {

Duration d = Duration.ofDays(365);
LocalTime lt = LocalTime.now().plus(d);
out.println(lt);

}}
