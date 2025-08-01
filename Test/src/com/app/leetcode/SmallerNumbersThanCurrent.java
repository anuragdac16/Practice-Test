package com.app.leetcode;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int [] output = new int[nums.length];

        for(int i =0; i< nums.length; i++){
            int count =0;
            for(int j =0; j< nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            output[i] = count;
        }
        System.out.println(output);
    }
}
