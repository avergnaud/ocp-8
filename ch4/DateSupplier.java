package ch4;

import java.util.function.*;
import java.time.*;

public class DateSupplier {
public static void main(String... args) {

Supplier<LocalDate> ds = LocalDate::now;
LocalDate now = ds.get();
System.out.println(now);


}
}