package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class _0579 {

public static void main(String... args) {

Comparator<String> c = (s1,s2) -> s2.compareTo(s1);

List<String> s = Arrays.asList("1","A","a","_","b","c");
Collections.sort(s,c);
out.println(s);
Collections.sort(s,c::compare);
out.println(s);

}}

