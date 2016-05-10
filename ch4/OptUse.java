package ch4;

import java.util.Optional;
import static java.lang.System.out;

public class OptUse {
public static void main(String... args) {

Optional<Integer> o = getMyInt();

if(o.isPresent()) {
	System.out.println(o.get());
}

/*Integer i = null;
o.ifPresent(some -> i = some);
BIDON + COMPILE PAS
*/

//public void ifPresent(Consumer<? super T> consumer)
o.ifPresent(out::println);

//public T orElse(T other)
Integer i = getAnyNumber().orElse(1);
out.println(i);

//public T orElseGet(Supplier<? extends T> supplier)
Integer j = getAnyNumber().orElseGet(()->new Integer(0));
out.println(0);

//public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X

}

static Optional<Integer> getMyInt() {
	return Optional.of(5);
}

static Optional<Integer> getAnyNumber() {
	return Optional.empty();
}

}