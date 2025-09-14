package com.app.leetcode;

public class MaximumBitwise {
    public static void main(String[] args) {
        int [] nums ={1,2,3,3,2,2};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int maxVal = 0, ans = 0, currentStreak = 0;

        for (int num : nums) {
            if (maxVal < num) {
                maxVal = num;
                ans = currentStreak = 0;
            }

            if (maxVal == num) {
                currentStreak++;
            } else {
                currentStreak = 0;
            }

            ans = Math.max(ans, currentStreak);
        }
        return ans;
    }
}
