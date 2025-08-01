package com.app.leetcode;

import java.util.*;

public class DaysWithoutMeeting {

    public static void main(String[] args) {
        int days = 10;
        int[][] meetings = {{5, 7}, {1, 3}, {9, 10}};
        //int[][] meetings = {{1, 6}};
        System.out.println(countDays(days, meetings));
    }

    public static int countDays(int days, int[][] meetings) {

        int freeDays = 0, latestEnd = 0;

        // Sort meetings based on starting times
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];

            if (start > latestEnd + 1) {
                freeDays += start - latestEnd - 1;
            }

            latestEnd = Math.max(latestEnd, end);
        }

        freeDays += days - latestEnd;

        return freeDays;
    }
}
