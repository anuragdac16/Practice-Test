package com.app.leetcode;

import java.util.HashSet;
import java.util.Set;

public class DisctinctArray {

    public static void main(String[] args) {

        int[] nums = {5,5};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int result = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                int j = i+1;
                int reminder = j % 3;

                result = reminder != 0 ? (j / 3) + 1 : j / 3;

                break;
            }
        }

        return result;
    }
}
