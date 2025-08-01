package com.app.jpmorgan;

import java.util.Collections;
import java.util.PriorityQueue;

public class Pairs {

    public static void main(String[] args) {
        // Example input
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 1};

        // Function call
        int result = findNumOfPairs(a, b);
        System.out.println("Maximum number of pairs: " + result);
    }

    public static int findNumOfPairs(int[] a, int[] b) {

        PriorityQueue<Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer i : a){
            queue1.add(i);
        }
        for (Integer i : b){
            queue2.add(i);
        }
        int result =0 ;
        for(int i =0; i < a.length; i++){
            if(queue1.peek().compareTo(queue2.peek()) == 1){
                result++;
                queue1.poll();
                queue2.poll();
            }
        }
        return  result;
    }
}
