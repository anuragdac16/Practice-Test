package com.app.neetcode.arrays;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagram implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        GroupAnagram groupAnagram = new GroupAnagram();
        GroupAnagram groupAnagram1 = (GroupAnagram) groupAnagram.clone();


        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>>  list = groupAnagrams(strs);

        list.forEach(System.out::println);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        return Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> {
                    char[] chars = str.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                })).values().stream().toList();

    }
    public static List<List<String>> groupAnagramsOption2(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        Arrays.stream(strs).forEach( str -> {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            map.computeIfAbsent(sortedString, v -> new ArrayList<>()).add(str);
        });
        return map.values().stream().toList();

    }
}
