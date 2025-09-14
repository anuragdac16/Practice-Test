package com.app.leetcode;

public class BrainPower {

    public static void main(String[] args) {

        int [][] questions = {{3,2},{4,3},{4,4},{2,5}};

        System.out.println(mostPoints(questions));

    }

    public static long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] arr = new long [n+1];

        for(int i = n -1 ; i >=0; i--){
            int points = questions[i][0];
            int brainPower = questions[i][1];

            long solve = points;
            if(i + brainPower+ 1 < n){
                solve += arr[i + brainPower +1];
            }
            long notSolve = arr[i + 1];

            arr[i] = Math.max(solve, notSolve);
        }

        return arr[0];
    }
}
