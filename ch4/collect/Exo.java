package ch4.collect;

import java.util.stream.*;

public class Exo {
public static void main(String... args) {

Stream<String> s = Stream.of("lions","tigers","bears","cats","dogs","ants","elephants");

/*
Ex 1: average length
*/
Double avg = s.collect(Collectors.average(String::length));

/*
Ex 2: ", "
*/

/*
Ex 3: tous les animaux qui commencent par "<<une lettre>" dans un tree set
*/

/*
Ex 4: map <nom, longueur>
*/

/*
Ex 5: map <longueur, nom>
*/

/*
map <longueur, nom>, si conflit ","
*/

/*
tree map <longueur, nom>, si conflit ","
*/




}}