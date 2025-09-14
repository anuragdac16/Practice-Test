package com.app.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        String[] strArr = {"act", "tac", "cat", "god", "dog"};

        Map<String, List<String>> map = Arrays.stream(strArr).sorted(Comparator.naturalOrder()).collect(Collectors.groupingBy(Function.identity()));

        map.entrySet().forEach( entry -> System.out.println(entry.getValue()));

        //System.out.println(Arrays.stream(strArr).sorted(Comparator.reverseOrder()).collect(Collectors.joining()));

    }
}
