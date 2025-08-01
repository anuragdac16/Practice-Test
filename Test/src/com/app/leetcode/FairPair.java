package com.app.leetcode;

import java.util.Arrays;

public class FairPair {
    public static void main(String[] args) {
        int [] nums = {0,1,7,4,4,5};
        int lower =3;
        int upper = 6;
        Arrays.sort(nums);
        int count =0;
        int i =0;
        int j = nums.length-1;
        while (i < j ){
            if(nums[i] + nums[j] > upper){
                if(i !=0){
                    i--;
                }
                j--;
            }else if(nums[i] + nums[j] < lower){
                i++;
            } else {
                count++;
                i++;
            }
        }

    }
}
