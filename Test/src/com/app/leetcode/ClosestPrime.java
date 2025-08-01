package com.app.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ClosestPrime {

    public static void main(String[] args) {
        int[] arr = closestPrimes(10, 1000000);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
    public static int[] closestPrimes(int left, int right) {

        int[] result = new int[2];
        List<Integer> list = new ArrayList<>();
        while (left <= right) {
            if (left ==2 || left % 2 != 0) {
                primeNumber(left, list);

            }
            left++;
        }
        int minimumDistance = Integer.MAX_VALUE;
        if(list.size() < 2){
            result[0] = -1;
            result[1] = -1;
        }else{
            for(int i =0; i < list.size()-1; i++){
                int minimumDistance1 = list.get(i+1) - list.get(i);
                if(minimumDistance1 < minimumDistance){
                    result[0] = list.get(i);
                    result[1] = list.get(i+1);
                    minimumDistance = minimumDistance1;
                }

            }
        }
        return result;
    }

    private static void primeNumber(int left, List<Integer> list) {
        if (left < 2) {
            return;
        }
        for (int i = 2; i <= Math.sqrt(left); i++) {
            if (left % i == 0) {
                return ;
            }
        }
        list.add(left);

    }
}
