package com.app.leetcode;

import java.util.*;

public class MidOperations {

    public static void main(String[] args) {

        int [][]grid = {{2,4},{6,8}};
        int  x = 2;

        System.out.println(minOperation(grid, x));
    }
    public static int minOperation(int[][] grid, int x) {

        List<Integer> gridList = Arrays.stream(grid).flatMapToInt(Arrays::stream).boxed().sorted(Comparator.naturalOrder()).toList();

        List<Integer> list = new ArrayList<>();
        for (int[] row : grid) {
            for (int num : row) {
                list.add(num);
            }
        }
        Collections.sort(list);

        int midNumber = gridList.get(gridList.size() /2);

        int result =0;
        for(int number : gridList){
            if(number % x != midNumber %x){
                return -1;
            }
            result += Math.abs(midNumber - number)/x;
        }
        return result;
    }
}
