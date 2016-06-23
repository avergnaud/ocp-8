package quizz;

import java.time.*;
import java.time.temporal.*;
import static java.lang.System.*;

public class _0109 {
public static void main(String... args) {

LocalTime lt = LocalTime.now();
//1
lt = lt.plusMinutes(1);
//2
lt = lt.plus(1,ChronoUnit.MINUTES);
//3
Duration d = Duration.ofMinutes(1);
lt = lt.plus(d);
//4
d = Duration.of(60);
lt = lt.plus(d);
out.println(lt);

}
}