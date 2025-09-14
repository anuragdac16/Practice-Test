package com.app.jpmorgan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    public static void main(String[] args) {

        int []nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));
        for (int num : freq.keySet()) {
            heap.offer(num);
            if (heap.size() > k) heap.poll();
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) res[i] = heap.poll();
        return res;
    }

}
