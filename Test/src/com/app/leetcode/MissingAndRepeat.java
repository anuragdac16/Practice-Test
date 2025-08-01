package com.app.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MissingAndRepeat {
    public static void main(String[] args) {
        int grid [][]  = {{1,3},{2,2}};
        int arr [] = findMissingAndRepeatedValues(grid);
        for (int ar : arr){
            System.out.println(ar);
        }

    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        Set<Integer> set = new HashSet<>();
        int totalSum = 0;
        int result[] = new int [2];
        int n = grid.length;
        for(int i =0; i< n; i++){
            for(int j=0; j< grid[i].length; j++){
                if(set.contains(grid[i][j])){
                    result[0] = grid[i][j];
                }else{
                    set.add(grid[i][j]);
                    totalSum = totalSum + grid[i][j];
                }
            }
        }

        int totalElements = n * n;
        int sum = (totalElements * (totalElements + 1)) / 2;
        result[1] =   sum - totalSum;
        return result;
    }
}