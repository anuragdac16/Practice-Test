package com.app.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
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
