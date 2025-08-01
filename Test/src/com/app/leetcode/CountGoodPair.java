package com.app.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountGoodPair {

    public static void main(String[] args) {
        int [] nums = {3,1,4,3,2,2,4};
        int k =2;
        System.out.println(countGood(nums, k));
    }

    public static long countGood(int[] nums, int k) {
        int value =0;
        int right =-1;
        Map<Integer, Integer> map =new HashMap<>();
        long result = 0;
        for (int i =0; i <nums.length; i++){
            while(value < k && right +1 < nums.length){
                right ++;
                value += map.getOrDefault(nums[right], 0);
                map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
            }
            if(value >=k){
                result += nums.length -right;
            }
            map.put(nums[i], map.get(nums[i]) -1);
            value -= map.get(nums[i]);
        }
        return result;
    }
}
