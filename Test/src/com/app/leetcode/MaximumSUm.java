package com.app.leetcode;

import java.util.*;

public class MaximumSUm {
    public static void main(String[] args) {
        int[] num = {10,12,19,14};
        int[] nums = {368,369,307,304,384,138,90,279,35,396,114,328,251,364,300,191,438,467,183};
        System.out.println(maximumSum(nums));
    }
    public static int maximumSum(int[] nums) {

        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for(Integer num : nums){
            int number = num;
            int sum = 0;
            while(number > 0){
                sum+= number%10;
                number = number/10;
            }
            if(map.get(sum) != null){
                PriorityQueue<Integer> value = map.get(sum);
                value.add(num);
                map.put(sum, value);
            }else{
                PriorityQueue<Integer> value = new PriorityQueue<>(Collections.reverseOrder());
                value.add(num);
                map.put(sum, value);
            }
        }
        return map.values().stream()
                .filter(pq -> pq.size() > 1)
                .mapToInt(pq -> pq.poll() + pq.poll())
                .max()
                .orElse(-1);
    }
}
