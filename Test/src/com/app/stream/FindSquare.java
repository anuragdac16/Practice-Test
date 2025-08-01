package com.app.stream;

import java.util.Arrays;

public class FindSquare {

    public static void main(String[] args) {

        //FIND SUM OF SQUARES
        int[] numbers = { 5, 3, 1, 4, 9, 7, 6, 8, 2 };


        System.out.println(Arrays.stream(numbers).map(a -> a * a).reduce(0, Integer::sum));
        System.out.println(Arrays.stream(numbers).map(a -> a * a).summaryStatistics());

    }
}
