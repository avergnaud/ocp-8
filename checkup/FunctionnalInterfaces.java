interface BooleanSupplier {
boolean getAsBoolean();
}
interface IntSupplier {
int getAsInt();
}
LongSupplier
DoubleSupplier

interface IntConsumer {
void accept(int i);
}
interface LongConsumer {
void accept(long l);
}
interface DoubleConsumer {
void accept(double d);
}

interface IntPredicate {
boolean test(int i);
}
LongPredicate
DoublePredicate

interface IntFunction<T> {
T apply(int i);
}
interface LongFunction<T> {
T apply(long l);
}
interface DoubleFunction<T> {
T apply(double d);
}



