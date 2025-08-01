package com.app.neetcode.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,6};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int[] nums) {
        return nums.length != Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
    }
}
