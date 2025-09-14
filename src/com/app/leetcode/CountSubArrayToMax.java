package com.app.leetcode;

public class CountSubArrayToMax {

    public static void main(String[] args) {
        int [] nums = {1,3,2,3,3};
        int k =2;
        System.out.println(countSubarrays(nums, k));
    }

    public static long countSubarrays(int[] nums, int k) {
        int maxElement = 0;
        for(int num : nums){
            if(maxElement < num){
                maxElement = num;
            }
        }
        long ans = 0, start = 0;
        int maxElementsInWindow = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == maxElement) {
                maxElementsInWindow++;
            }
            while (maxElementsInWindow == k) {
                if (nums[(int) start] == maxElement) {
                    maxElementsInWindow--;
                }
                start++;
            }
            ans += start;
        }
        return ans;
    }
}
