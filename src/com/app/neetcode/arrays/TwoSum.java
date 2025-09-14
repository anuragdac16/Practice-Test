package com.app.neetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int [] nums = {1,3,4,2};
        int target = 7;
        int []output = findTwoSum(nums, target);
        System.out.println(output[0] +"-"+output[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int []result = new int [2];
        for(int i =0; i < nums.length; i++){
            map.put( nums[i], i );
        }
        for(int i =0; i < nums.length; i++){
            int num = target-nums[i];
            if(map.get(num) != null && map.get(num) !=i){
                result[0] = i;
                result[1] = map.get(num);
                return result;
            }
        }
        return result;
    }

    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // number -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {}; // No solution
    }
}
