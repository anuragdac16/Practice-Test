package com.app;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Solution {

    public static void main(String[] args) {
        String str = "swissre";

        System.out.println(getFirstNonRepeatChar(str));

    }
    public static Character getFirstNonRepeatChar(String str) {

        Map<Character, Integer> characterMap = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.summingInt(e->1)));

        for (Map.Entry<Character, Integer> entry : characterMap.entrySet()) {

            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
}
