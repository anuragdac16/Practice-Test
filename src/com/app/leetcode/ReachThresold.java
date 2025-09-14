package com.app.leetcode;

import java.util.PriorityQueue;

public class ReachThresold {
    public static void main(String[] args) {
        int [] nums = {2,11,10,1,3};
        int k = 10;
        System.out.println(minOperations(nums, k));
    }
    public static int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        int result= 0;
        for (Integer num: nums){
            minHeap.add((long)num);
        }
        while(!minHeap.isEmpty()){
            long firstMin = minHeap.poll();
            if(minHeap.isEmpty()){
                return result;
            }
            long secondMin = minHeap.poll();
            if(firstMin <k ){
                long number = Math.min(firstMin, secondMin) * 2 + Math.max(firstMin, secondMin);
                minHeap.add(number);
                result++;
            }else{
                break;
            }

        }

        return result;
    }
}
