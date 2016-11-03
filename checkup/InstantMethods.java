//class java.time.Instant implements Comparable<Instant>

int compareTo(Instant otherInstant)

static Instant now()

static Instant ofEpochSecond(long)
static Instant ofEpochMilli(long epochMilli)
long toEpochMilli()

static Instant parse(CharSequence text) /* 2007-12-03T10:15:30.00Z */

public long getEpochSecond()

boolean isAfter(Instant otherInstant)
boolean isBefore(Instant otherInstant)

Instant minus(long, TemporalUnit unit) /*any unit day or smaller*/
Instant minus(TemporalAmount amountToSubstract) /* use Duration */
Instant minusSeconds(long secondsToSubstract)
Instant minusMillis(long millisToSubstract)
Instant minusNanos(long nanosToSubstract)

Instant plus(long, TemporalUnit unit) /*any unit day or smaller*/
Instant plus(TemporalAmount amountToAdd) /* use Duration */
Instant plusSeconds(long secondsToAdd)
Instant plusMillis(long millisToAdd)
Instant plusNanos(long nanosToAdd)
