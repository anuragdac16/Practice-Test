package com.app.neetcode.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequntElement {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,3,3};
        int k = 2;
        Arrays.stream(topKFrequent(nums, k)).forEach(System.out::println);
    }
    public static int[] topKFrequent(int[] nums, int k) {

        return Arrays.stream(nums).boxed().
                collect(Collectors.groupingBy(Function.identity())).
                entrySet().stream().filter(entry -> entry.getValue().size() >= k)
                .map(Map.Entry::getKey).toList().stream().mapToInt(Integer::intValue).toArray();

    }
}
