package ch3.deque;

import java.util.*;

public class Nulls {
public static void main(String[] args) {
Deque<String> d = new ArrayDeque<String>();
d.offerFirst(null);
ArrayDeque<String> e = new ArrayDeque<String>();
e.offerFirst(null);
}
}
