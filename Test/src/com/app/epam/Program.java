package com.app.epam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Map<String, List<String>> maps = new HashMap<>();
        maps.put("Animals", Arrays.asList("Tiger","Dog","Cat","Deer","Monkey","SPARROW","Tiger","Cat")); // ignore SPARROW
        maps.put("Fruits", Arrays.asList("apple","mango","banana","grape")); // all ignore
        maps.put("Cities", Arrays.asList("Hyderabad","Pune","Mumbai","New York","Goa","Chennai","Pune")); // ignore New York and remove duplicate

        List<String> ani = maps.entrySet().stream().flatMap(map ->{
            if(map.getKey().equals("Animals")){
                return map.getValue().stream()
                        .filter( a -> !a.equals("SPARROW"));
            }else if(map.getKey().equals("Cities")){
                return map.getValue().stream()
                        .filter( a -> !a.equals("New York"))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.collectingAndThen(Collectors.counting() , Long::intValue)))
                        .entrySet().stream().filter(m -> m.getValue() ==1).map(Map.Entry::getKey);
            }else {
                return null;
            }
        }).toList();

        System.out.println("ANI" + ani);
        System.out.println("++++++++");

        List<String> animals =  maps.get("Animals").stream()
                .filter( a -> !a.equals("SPARROW")).collect(Collectors.toList());

        Map<String, Long> cities =  maps.get("Cities").stream()
                .filter( a -> !a.equals("New York"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        animals.addAll(cities.entrySet().stream().filter(m -> m.getValue() ==1).map(Map.Entry::getKey).toList());
        System.out.println(animals);

    }
}
