//final class java.time.format.DateTimeFormatter

//no public constructor

public static DateTimeFormatter ISO_LOCAL_DATE
public static DateTimeFormatter ISO_LOCAL_TIME
public static DateTimeFormatter ISO_LOCAL_DATE_TIME


//
static DateTimeFormatter ofLocalizedTime(FormatStyle timeStyle)
static DateTimeFormatter ofLocalizedDate(FormatStyle timeStyle)
static DateTimeFormatter ofLocalizedDateTime(FormatStyle timeStyle)


String	format(TemporalAccessor temporal)

/*
Interface TemporalAccessor
All Known Implementing Classes:
Instant, LocalDate, LocalDateTime, LocalTime, java.time.Month, ZonedDateTime

java.time.temporal.ChronoUnit.MONTHS

mais j'ai jamais pu caster le résultat...
*/
TemporalAccessor	parse(CharSequence text)
