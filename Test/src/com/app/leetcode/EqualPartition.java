package com.app.leetcode;


public class EqualPartition {

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 4, 5};
        System.out.println(canPartition(nums));
    }

    public static boolean canPartition(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        if (total % 2 != 0) return false;

        int target = total / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                if (dp[i - num]) {
                    dp[i] = true;
                }
            }
        }

        return dp[target]; // Can we make sum = target?
    }

}
