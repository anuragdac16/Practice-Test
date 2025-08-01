package com.app.main;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("5", 5);
        map.put("8", 8);
        map.put("7", 7);
        map.put("6", 6);
        map.put("4", 4);
        map.put("9", 9);
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingInt(Integer::intValue)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
                //.forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

        System.out.println("Sorted Map by Values:");
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
