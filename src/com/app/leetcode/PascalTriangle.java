package com.app.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(" Generate  method with recursion ");
        System.out.println(generate(5));
        System.out.println(" Generate  method with for loop ");
        System.out.println(generate1(6));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }

        if (numRows == 1) {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);
            return result;
        }

        result = generate(numRows - 1);
        List<Integer> prevRow = result.get(numRows - 2);
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);

        for (int i = 1; i < numRows - 1; i++) {
            currentRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }

        currentRow.add(1);
        result.add(currentRow);

        return result;
    }

    public static List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            int n=1;
            for(int j=0;j<=i;j++){
                row.add(n);
                n=n*(i-j)/(j+1);
            }
            res.add(row);
        }
        return res;

    }
}
