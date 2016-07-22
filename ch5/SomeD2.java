package ch5;

import java.time.Duration;
import java.time.LocalTime;
import static java.lang.System.out;

public class SomeD2 {
public static void main(String... args) {

Duration d = Duration.ofDays(2);//PT48H
out.println(d);
d = Duration.ofHours(24);//PT24H
out.println(d);
d = Duration.ofMinutes(65);//PT65M
out.println(d);
d = Duration.ofSeconds(1);
out.println(d);
d = Duration.ofMillis(1);
out.println(d);
d = Duration.ofNanos(1);
out.println(d);

}}
