package ch5.someprops;

import java.util.*;
import static java.lang.System.out;

public class Lecture {
public static void main(String... args) {

Locale deutshInDeutschland = new Locale("de","DE");

ResourceBundle deDE = ResourceBundle.getBundle("LECTURE",deutshInDeutschland);

out.println(deDE.getString("cle1"));

}}
