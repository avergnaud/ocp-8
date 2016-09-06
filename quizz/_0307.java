package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.function.*;

public class _0307 {

public static void main(String... args) {

Runnable r = String::new;
Callable<String> c = String::new;
Supplier<String> s = String::new;

/*
error: reference to schedule is ambiguous
Future<?> f = service.schedule(String::new,1,TimeUnit.SECONDS);
                     ^
  both method schedule(Runnable,long,TimeUnit) in ScheduledExecutorService and method <V>schedule(Callable<V>,long,TimeUnit) in ScheduledExecutorService match
  where V is a type-variable:
    V extends Object declared in method <V>schedule(Callable<V>,long,TimeUnit)
*/
}}
