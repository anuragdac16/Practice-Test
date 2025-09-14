package com.app.company;

import java.util.Arrays;

public class LongestIncreasingSequence {
    public static void main(String[] args) {

        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Length of LIS : " + lengthOfLIS(arr));
    }

    public static int lengthOfLIS(int[] arr) {
        int[] arr1 = new int[arr.length];
        int result = 0;
        for (int number : arr) {
            int index = Arrays.binarySearch(arr1, 0, result, number);
            if (index < 0) {
                index = -(index + 1);
                arr1[index] = number;
                if (index == result) {
                    result++;
                }
            }
        }
        return result;
    }
}
