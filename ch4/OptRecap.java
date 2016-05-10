package ch4;

import java.util.Optional;

public class OptRecap {
public static void main(String... args) {

// static <T> Optional<T> empty()
Optional<String> empty = Optional.empty();

//static <T> Optional<T> of(T value)
Optional<String> some = Optional.of("hello");

//static <T> Optional<T> ofNullable(T value)
Optional<String> nn = Optional.ofNullable(null);

Optional<String> l = getMyOptional();
//System.out.println(l.isPresent()); NPE
//String test = l.get(); java.util.NoSuchElementException: No value present

if(/*l.isEmpty()*/ !l.isPresent()) {
	System.out.println("empty");
} else {
	String test = l.get();
	System.out.println(test);
}

}

static Optional<String> getMyOptional() {
//return Optional.of(null); NPE
//return null;
return Optional.empty();
}


}