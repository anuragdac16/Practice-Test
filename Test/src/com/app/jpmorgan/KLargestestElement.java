package com.app.jpmorgan;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestestElement {
    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        int k = 3;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.offer(num);
            if (heap.size() > k) heap.poll();
        }
        return heap.peek();
    }

}
