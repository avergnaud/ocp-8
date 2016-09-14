package ch8;

import static java.lang.System.out;
import java.io.*;
import java.time.*;

public class Info {
public static void main(String... args) {

if(args.length != 1)
	return;

File file = new File(args[0]);
if(!file.exists()) {
	out.println(args[0] + "does not exist");
	return;
}
if(file.isFile()) {
out.println("file: " + file.getName() + "size: " + file.length());
} else if(file.isDirectory()) {
int number = file.listFiles().length;
out.println("directory with " + number + " files or dirs");
}

}}
