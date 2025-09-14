package com.app.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeastOccurrence {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(getFirstLeastOccurrence(str));

    }

    private static char getFirstLeastOccurrence(String str) {
        Map<Character, Integer> map = str.chars().mapToObj(c -> (char) c) .
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.summingInt(i ->1)));

        char ch = 0;
        int leastCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() < leastCount){
                ch = entry.getKey();
                leastCount = entry.getValue();
            }
        }
        return ch;
    }
}
