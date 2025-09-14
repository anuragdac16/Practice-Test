package com.app.stack;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {


        List<String > groupList = Arrays.asList("Group 4", "3 Group","11 Group", "2 Group" , "22 Group","Group 3");


        Map<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(1, "1 Group");
        sortedMap.put(2, "22 Group");
        sortedMap.put(3, "11 Group");
        sortedMap.put(4, "Group 2");
        sortedMap.put(5, "Group 55");
        sortedMap.put(6, "Group 6");
        sortedMap.put(7, "Group 7");


        sortedMap = sortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));


        System.out.println(sortedMap);

        System.out.println();
        System.out.println("------");
        System.out.println();
        Collections.sort(groupList);
        System.out.println(groupList);

        System.out.println();
       // Find the first non-repeated character in a string
        String tempStr = "rohitrohi";
        Character output = new Character(tempStr.charAt(0));


        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i < tempStr.length(); i++){
            if(map.containsKey(tempStr.charAt(i))){
                int value = map.get(tempStr.charAt(i));
                map.put(tempStr.charAt(i), ++value);
            }else{
                output = tempStr.charAt(i);
                map.put(tempStr.charAt(i), 1);
            }
        }
        System.out.println(output);




        System.out.println( "Using Java 8 : "+tempStr.chars().mapToObj( ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() == 1).findFirst().get().getKey());



    }
}
