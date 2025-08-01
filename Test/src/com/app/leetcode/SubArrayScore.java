package com.app.leetcode;

public class SubArrayScore {

    public static void main(String[] args) {
        int [] nums = {2,1,4,3,5};
        int k = 10;
        System.out.println(countSubarrays(nums, k));
    }

    public static long countSubarrays(int[] nums, long k) {
        
        long res = 0, total = 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            total += nums[j];
            while (i <= j && total * (j - i + 1) >= k) {
                total -= nums[i];
                i++;
            }
            res += j - i + 1;
        }
        return res;

    }
}
