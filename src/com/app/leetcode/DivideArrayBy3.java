package com.app.leetcode;

import java.util.Arrays;

public class DivideArrayBy3 {

    public static void main(String[] args) {

        int nums [] = {1,3,4,8,7,9,3,5,1};
        int k = 2;

        System.out.println(Arrays.deepToString(divideArray(nums, k)));

    }

    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int [][]result = new int[nums.length/3][3];

        for(int i =0; i < nums.length;){
            int [] innerArray = new int[3];
            innerArray[0] = nums[i];
            innerArray[1] = nums[i+1];
            innerArray[2] = nums[i+2];
            i = i+3;
            if(innerArray[2] - innerArray[0] > k)
                return new int[0][0];
            result[i/3 -1] = innerArray;
        }
        return  result;
    }
}