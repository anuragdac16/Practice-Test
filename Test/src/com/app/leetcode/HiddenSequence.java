package com.app.leetcode;

public class HiddenSequence {

    public static void main(String[] args) {
        int [] differences = {1,-3,4};
        int  lower = 1, upper = 6;
        System.out.println(numberOfArrays(differences, lower, upper));
    }

    public static int numberOfArrays(int[] differences, int lower, int upper) {
        int x = 0, y = 0, cur = 0;
        for (int d : differences) {
            cur += d;
            x = Math.min(x, cur);
            y = Math.max(y, cur);
            if (y - x > upper - lower) {
                return 0;
            }
        }
        return (upper - lower) - (y - x) + 1;
    }
}
