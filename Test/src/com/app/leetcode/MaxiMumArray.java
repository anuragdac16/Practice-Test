package com.app.leetcode;

import java.util.Arrays;

public class MaxiMumArray {
    public static void main(String[] args) {
        int[] nums = {2,2,4,5};
        int k = 0;
        System.out.println(partitionArray(nums, k));


    }
    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count =1;
        int firstElementOfInnerArray = nums[0];
        for(int i =1; i < nums.length; i++){

            if(nums[i] - firstElementOfInnerArray > k ){
                firstElementOfInnerArray = nums[i];
                count++;
            }

        }
        return count;
    }
}
