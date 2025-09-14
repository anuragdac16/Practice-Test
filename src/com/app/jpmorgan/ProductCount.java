package com.app.jpmorgan;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductCount {
    public static void main(String[] args) {
        List<String > products = new ArrayList<>();
        products.add("Apple");
        products.add("Banana");
        products.add("Cashew");
        products.add("Cashew");
        products.add("Apple");

        System.out.println(getLeastProduct(products));
    }

    public static String getLeastProduct(List<String> products){
        Map<String, Integer> map = products.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
        Map<Integer, Set<String>> conntMap = new HashMap<>();

        long maxCount = map.values().stream().max(Integer::compare).orElse(0);

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .map(Map.Entry::getKey)
                .min(Comparator.naturalOrder()) // lexicographically largest
                .orElse(null);


        /*for(Map.Entry<String, Integer> m : map.entrySet()){
            maxCount = Math.max(maxCount, m.getValue());
            if(conntMap.containsKey(m.getValue())){
                conntMap.get(m.getValue()).add(m.getKey());
            }else{
                Set<String> set = new TreeSet<>(Collections.reverseOrder());
                PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
                set.add(m.getKey());
                conntMap.put(m.getValue(), set);
            }
        }
        return conntMap.get(maxCount).stream().findFirst().get();*/

    }
}
