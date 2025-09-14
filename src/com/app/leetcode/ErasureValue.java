package com.app.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ErasureValue {

    public static void main(String[] args) {
        int []nums = {187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,
                467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};

        int []nums1= {10000,1,10000,1,1,1,1,1,1};
        System.out.println(getErasurevalue(nums1));


    }
    static Integer getErasurevalue(int [] nums){

        int right=0;
        int left =0;
        int length = nums.length;
        Set<Integer> set = new HashSet<>();
        int sumOfSubArray =0;
        int result =0;
        while(right < length){
            if(!set.contains(nums[right])){
                set.add(nums[right]);
                sumOfSubArray+=nums[right];
                right++;
            }else{
                set.remove(nums[left]);
                result = Math.max(result, sumOfSubArray);
                sumOfSubArray-=nums[left];
                left++;
            }
        }
        result = Math.max(result, sumOfSubArray);
        //return Arrays.stream(nums).boxed().collect(Collectors.toSet()).stream().reduce(Integer::sum).get();
        return result;
    }
}
