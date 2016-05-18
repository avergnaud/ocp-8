package ch4.intermediate;

import java.util.stream.*;
import static java.lang.System.out;

public class Peek {
public static void main(String... args) {

Stream<String> stream = Stream.of("kslqdJ","LQKEFjs","djqsd","xjkcnsk","aeaoizoi","qklslk");
long count = stream.peek(s -> out.println("before filter : " + s))
	.filter(s -> s.contains("j"))
	.peek(s -> out.println("after filter : " + s))
	.count();

out.println(count);

}}
