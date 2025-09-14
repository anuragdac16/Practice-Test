package com.app.stream;

import java.util.LinkedList;
import java.util.List;


public class ParallelStream {
    public static void main(String[] args) {
        List<Character> list = new LinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('g');
        list.add('h');
        list.add('i');
        list.add('j');
        list.add('k');
        list.add('l');
        list.add('m');
        list.add('n');
        list.add('o');
        list.add('p');
        list.add('q');
        list.add('r');
        list.add('s');
        list.add('t');
        list.add('u');
        list.add('v');
        list.add('w');
        list.add('x');
        list.add('y');
        list.add('z');

        System.out.println(list.size());
        list.parallelStream().map(m -> m.toString().toUpperCase()).forEach(System.out::println);

    }
}
