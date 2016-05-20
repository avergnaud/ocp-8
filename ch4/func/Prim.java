package ch4.func;

import java.util.function.*;
import static java.lang.System.*;

public class Prim {
public static void main(String... args) {

ToIntBiFunction<String,Object> i1 =
	(s,o)->s.length() + o.hashCode();
int test = i1.applyAsInt("toto",new Object());
out.println(test);

ObjIntConsumer<String> i2 = (s,i) -> out.println(s + " and " + i);
i2.accept("hello",7);

}}