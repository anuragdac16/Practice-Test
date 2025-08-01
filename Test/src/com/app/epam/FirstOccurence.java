package com.app.epam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstOccurence {
    public static void main(String[] args) {
        String str = "stress";
       // Map<Character, Integer> map = new LinkedHashMap<>();
//        for (Character ch : str.toCharArray()){
//            map.put(ch, map.getOrDefault(ch,0)+1);
//        }
//        map =  str.chars().mapToObj(c -> (char)c).collect(Collectors.toMap(s ->s ,s ->1,Integer::sum,LinkedHashMap::new));

        System.out.println(str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.summingInt(s -> 1)))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get().getKey());




    }
}
