package com.app.leetcode;

public class SetZero {

    public static void main(String[] args) {
        int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt +" ");
            }
            System.out.println();
        }

    }
    public static void setZeroes(int[][] matrix) {
        int [][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i].clone();
        }
        for(int i =0; i < matrix.length; i++){
            for(int j =0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    setRowAndColumnZero(matrix, i, j, result);

                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            matrix[i] = result[i].clone();
        }
    }

    public static void setRowAndColumnZero(int[][] matrix, int row, int col,int[][] result){
        int i =row;
        int j =col;
        while(i > 0 ){
            result[i-1][col] = 0;
            i--;
        }
        i =row;
        while(i < matrix.length-1){
            result[i+1][col] = 0;
            i++;
        }
        while(j > 0 ){
            result[row][j-1] = 0;
            j--;
        }
        j= col;
        while(j < matrix[row].length-1){
            result[row][j+1] = 0;
            j++;
        }

    }
}
