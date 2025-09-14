package com.app.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCount {
    public static void main(String[] args) {
        String str =  "manojpandey_1@1";


       str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);

      //  System.out.println(map);


//        str.chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().filter(m -> m.getValue() >1).forEach(a ->{
//                    System.out.println(a.getKey() +"-" +a.getValue());
//                });
    }
}
