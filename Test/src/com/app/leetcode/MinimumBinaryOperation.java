package com.app.leetcode;

public class MinimumBinaryOperation {
    public static void main(String[] args) {

        int[] nums = {0, 1, 1, 1, 0, 0};
        System.out.println(minOperations(nums));

    }

    public static int minOperations(int[] nums) {

        int result =0;

        int left =0;
        int right =2;
        int length = nums.length;
        while (right< length){
            if(nums[left] == 0){
                nums[left] = 1;
                nums[left+1] = nums[left+1] == 1? 0:1;
                nums[left+2] = nums[left+2] == 1? 0:1;
                result++;
            }
            left++;
            right++;

        }
        return checkNumsisOne(nums) ? result:-1;

    }

    private static boolean checkNumsisOne(int[] nums) {
        for(int num : nums){
            if(num == 0){
                return false;
            }
        }
        return true;
    }
}
