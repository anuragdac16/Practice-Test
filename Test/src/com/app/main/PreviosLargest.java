package com.app.main;

import java.util.Arrays;
import java.util.Stack;

public class PreviosLargest {
    public static void main(String[] args) {
        int [] nums = {10,4,2,20,40,12,30};
        int [] result = getPreviousLargest(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getPreviousLargest(int[] nums) {
        int [] result = new int[nums.length];

        Stack<Integer> stack = new Stack<>();
        for (int i =0; i< nums.length; i++){
            if(stack.isEmpty()){
                result[i] = -1;
            }else {
                while(!stack.isEmpty() && stack.peek()< nums[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    result[i] = -1;
                }else {
                    result[i] = stack.peek();
                }

            }
            stack.add(nums[i]);
        }

        return result;
    }
}
