package com.app.main;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap.add(60);
        minHeap.add(2);
        minHeap.add(30);
        minHeap.add(7);
        minHeap.add(20);
        minHeap.add(10);

        System.out.println(minHeap);

        System.out.println(minHeap.poll());
        System.out.println(minHeap.peek());


        System.out.println(minHeap);
    }
}
