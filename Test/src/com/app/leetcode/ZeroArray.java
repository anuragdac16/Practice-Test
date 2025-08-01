package com.app.leetcode;

public class ZeroArray {
    public static void main(String[] args) {

        int[] nums = {1, 0, 1};
        int[][] queries = {{0, 2}};
        System.out.println(isZeroArray(nums, queries));
    }

    public static boolean isZeroArray(int[] nums, int[][] queries) {
        int[] deltaArray = new int[nums.length + 1];
        for (int[] query : queries) {
            deltaArray[query[0]] += 1;
            deltaArray[query[1] + 1] -= 1;
        }

        int[] operationCounts = new int[deltaArray.length];
        int currentOperations = 0;
        for (int i = 0; i < deltaArray.length; i++) {
            currentOperations += deltaArray[i];
            operationCounts[i] = currentOperations;
        }
        for (int i = 0; i < nums.length; i++) {
            if (operationCounts[i] < nums[i]) {
                return false;
            }
        }
        return true;
    }


}
