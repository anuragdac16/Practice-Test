package com.app.neetcode.twopointer;

public class ContainerHeight {
    public static void main(String[] args) {
        int []height = {1,7,2,5,4,7,3,6};
        int [] heights={1,7,2,5,12,3,500,500,7,8,4,7,3,6};
        System.out.println(maxArea(heights));
    }
    public static int maxArea(int[] heights) {

        int i = 0;
        int j = heights.length-1;
        int result =0;
        while(i<j){

            int number = (j-i) * Math.min(heights[i], heights[j]);
            if(number> result){
                result = number;
            }
            if (heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return result;
    }
}
