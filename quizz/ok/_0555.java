package quizz;

import static java.lang.System.out;
import java.io.*;

/*
assume user dir is "/home/ubuntu/dev/git/avergnaud/ocp-8/"
assume someName.txt does not exists
*/
public class _0555 {
public static void main(String... args) {

File file = new File("/home/ubuntu/dev/git/avergnaud/ocp-8/someName.txt");
File another = new File("/home/ubuntu/dev/git/avergnaud/ocp-8/someOtherName.tx");
boolean b = file.renameTo(another);
out.println(b);
out.println(file.getName());
out.println(another.getName());

File thisoneexists = new File("/home/ubuntu/dev/git/avergnaud/ocp-8/thisoneexists.txt");
File andAnotherOne = new File("/home/ubuntu/dev/git/avergnaud/ocp-8/andAnotherOne.tx");
boolean c = thisoneexists.renameTo(andAnotherOne);
out.println(c);
out.println(thisoneexists.getName());
out.println(andAnotherOne.getName());

}}
