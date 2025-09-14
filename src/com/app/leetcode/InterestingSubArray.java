package com.app.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterestingSubArray {

    public static void main(String[] args) {
        List<Integer> nums = List.of(3,2,4);
        int modulo = 2, k = 1;
        System.out.println(countInterestingSubarrays(nums, modulo, k));
    }
    public static long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long result = 0;
        int pre = 0;
        map.put(0,1);
        for (Integer num : nums) {
            pre += num % modulo == k ? 1 : 0;
            result += map.getOrDefault((pre - k + modulo) % modulo, 0);
            map.put(pre % modulo, map.getOrDefault(pre % modulo, 0) + 1);
        }
        return result;
    }
}
