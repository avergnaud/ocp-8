package ch4.ex;

import java.util.Optional;

public class OptionalEx2 {

public static void main(String... args) {
Optional<String> os = Optional.of("toto");

Optional<Integer> result = os.flatMap(OptionalEx2::getLength);

}

private static Optional<Integer> getLength(String input) {
//null input ?
return Optional.of(input.length());
}

}
