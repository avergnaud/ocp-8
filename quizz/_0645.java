package quizz;

import static java.lang.System.out;
import java.util.*;

/*
ONCE_en.properties
age=4

ONCE_fr.properties
name=Dolly
*/
public class _0645 {

public static void main(String... args) {

Locale.setDefault("en","US");
Locale fr = new Locale("fr");

ResourceBundle rb = ResourceBundle.getBundle("ONCE",fr);
out.println(rb.getString("name"));

}}
 
