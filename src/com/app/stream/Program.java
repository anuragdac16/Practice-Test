package com.app.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,3,4,5,6,6,7,8,9,9);

       // Map<Integer, Integer> mao =
                list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e1 ->1)))
                .entrySet().stream().filter(m -> m.getValue() >1)
                //.map(m -> m.getKey()).reduce((x1,x2) -> (x1+x2)).get());
                .forEach(System.out::println);
                //collect(Collectors.toList());
    }
}
