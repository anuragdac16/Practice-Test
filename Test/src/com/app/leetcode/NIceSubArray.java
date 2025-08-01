package com.app.leetcode;

public class NIceSubArray {

    public static void main(String[] args) {
        int[] nums = {1, 3, 8, 48, 10};
        System.out.println(longestNiceSubarray(nums));
    }


    public static int longestNiceSubarray(int[] nums) {

        int left = 0;
        int bitmask = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {
            // While there is a conflict in the current window, shrink the window from the left
            while ((bitmask & nums[right]) != 0) {
                bitmask ^= nums[left]; // Remove nums[left] from the bitmask
                left++;
            }
            // Add the current element to the window
            bitmask |= nums[right];
            // Update the result
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}



