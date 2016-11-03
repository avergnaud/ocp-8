//class java.time.LocalDateTime implements Comparable<LocalDateTime>

int compareTo(LocalDateTime other)

static LocalDateTime now()
static LocalDateTime now(ZoneId)
static LocalDateTime of(LocalDate,LocalTime)
static LocalDateTime of(int year,int month,int day,int hour,int min)
static LocalDateTime of(int year,int month,int day,int hour,int min,int second)
static LocalDateTime of(int year,int month,int day,int hour,int min,int second,int nanos)
static LocalDateTime of(int year,Month month,int day,int hour,int min)
static LocalDateTime of(int year,Month month,int day,int hour,int min,int second)
static LocalDateTime of(int year,Month month,int day,int hour,int min,int second,int nanos)

static LocalDateTime	parse(CharSequence text)
/*Obtains an instance of LocalDateTime from a text string such as 2007-12-03T10:15:30.*/

static LocalDateTime	parse(CharSequence text, DateTimeFormatter formatter)
/*Obtains an instance of LocalDateTime from a text string using a specific formatter.*/

static LocalDateTime ofEpochSecond(long epochSecond,
                                          int nanoOfSecond,
                                          ZoneOffset offset)

static LocalDateTime ofInstant(Instant instant,
                                      ZoneId zone)


String format(DateTimeFormatter formatter)

boolean isAfter(LocalDateTime other)
boolean isBefore(LocalDateTime other)
boolean isEqual(LocalDateTime other)

int getYear()
Month getMonth()
int getMonthValue()
DayOfWeek getDayOfWeek()
int getDayOfMonth()
int getDayOfYear()
int getHour()
int getMinute()
int getSecond()
int getNano()

LocalDateTime plus(TemporalAmount amountToAdd)
LocalDateTime plus(long amountToAdd, TemporalUnit unit)
LocalDateTime plusYears(long)
LocalDateTime plusWeeks(long)
LocalDateTime plusMonths(long)
LocalDateTime plusDays(long)
LocalDateTime plusHours(long)
LocalDateTime plusMinutes(long)
LocalDateTime plusSeconds(long)
LocalDateTime plusNanos(long)

LocalDateTime minus(TemporalAmount amountTosubstract)
LocalDateTime minus(long amountTosubstract, TemporalUnit unit)
LocalDateTime minusYears(long)
LocalDateTime minusWeeks(long)
LocalDateTime minusMonths(long)
LocalDateTime minusDays(long)
LocalDateTime minusHours(long)
LocalDateTime minusMinutes(long)
LocalDateTime minusSeconds(long)
LocalDateTime minusNanos(long)
