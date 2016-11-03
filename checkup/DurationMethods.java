//class java.time.Duration
// implements Serializable, Comparable<Duration>

public int compareTo(Duration otherDuration)

static Duration of(long amount, TemporalUnit unit)
static Duration ofDays(long l)
static Duration ofHours(long)
static Duratoin ofMinutes(long)
static Duration ofSeconds(long)
static Duration ofMillis(long)
static Duration ofNanos(long)

Duration plus(long amountToAdd, TemporalUnit unit)
Duration plusDays(long l)
Duration plusHours(long l)
Duration plusMinutes(long l)
Duration plusSeconds(long l)
Duration plusMillis(long)
Duration plusNanons(long)

Duration minus(long amountToSubstract, TemporalUnit unit)
Duration minusDays(long l)
Duration minusHours(long l)
Duration minusMinutes(long l)
Duration minusSeconds(long l)
Duration minusMillis(long)
Duration minusNanons(long)

public static Duration between(Temporal startInclusive,
                               Temporal endExclusive)
