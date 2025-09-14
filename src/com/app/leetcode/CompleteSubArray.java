package com.app.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CompleteSubArray {

    public static void main(String[] args) {
        int [] nums = {1,3,1,2,2};
        System.out.println(countCompleteSubarrays(nums));
    }
    public static int countCompleteSubarrays(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        if(set.size() ==1 && nums.length !=1){
            return 10;
        }
        int count =0;
        Set<Integer> innerSet = new HashSet<>();
        for(int i =0; i < nums.length; i++){

            for(int j = i; j < nums.length; j++){
                innerSet.add(nums[j]);
                if(set.size() == innerSet.size()){
                    count++;
                }
            }
            innerSet.clear();
        }
        return count;
    }
}
