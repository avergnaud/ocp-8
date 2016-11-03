#java.time.ZonedDateTime immutable



static ZonedDateTime of(LocalDateTime ldt, ZoneId id)
static ZonedDateTime of(LocalDate ld, LocalTime lt, ZoneId id)
static ZonedDateTime of(int year, int month, int dayOfMonth, int hour, int min, int s, int nanoSeconds,ZoneId)

// !!!
static ofInstant

String format(DateTimeFormatter formatter)
static ZonedDateTime parse(CharSequence text)

ZonedDateTime plus(int amount, java.time.temporal.ChronoUnit unit)
ZonedDateTime plus(TemporalAmount amount)
/*
Interface TemporalAmount
All Known Implementing Classes:
Duration, Period
*/
ZonedDateTime plusYears(long years)
ZonedDateTime plusMonths(long months)
ZonedDateTime plusWeeks(long weeks)
ZonedDateTime plusDays(long days)
ZonedDateTime plusHours(long hours)
ZonedDateTime plusMinutes(long minutes)
ZonedDateTime plusSeconds(long seconds)
ZonedDateTime plusNanos(long nanos)

/* idem MINUS */

int compareTo(ZonedDateTime other)
boolean isBefore(ZonedDateTime other)
boolean isAfter(ZonedDateTime other)

public long until(Temporal endExclusive, ChronoUnit unit)
/*
Interface Temporal
All Known Implementing Classes:
Instant, LocalDate, LocalDateTime, LocalTime, ZonedDateTime
*/
