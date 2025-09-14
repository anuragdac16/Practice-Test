package com.app.leetcode;

public class FixedBoundSubArray {
    public static void main(String[] args) {
        int [] nums = {1,3,5,2,7,5};
        System.out.println(countSubarrays(nums, 1, 5));
    }
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        int count =0;
        boolean minBool = false, maxBool = false;
        for(int i =0; i < nums.length; i++){
            if(nums[i] > maxK || nums[i] < minK){
                return count;
            }
            if(nums[i] == minK){
                minBool = true;
            }
            if(nums[i] == maxK){
                maxBool = true;
            }
            if(minBool && maxBool){
                count++;
            }
        }
        return count;
    }
}
