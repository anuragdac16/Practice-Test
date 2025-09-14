package com.app.leetcode;

public class BinarySubstring {

    public static void main(String[] args) {
        String input = "00110011";
        int number = getCountBinarySubstring(input);
        System.out.println(number);

    }

    private static int getCountBinarySubstring(String input) {

        int prev =0;
        int curr =1;
        int length =input.length();
        int total =0;

        for(int i =1; i < length; i++){

            if(input.charAt(i) == input.charAt(i-1)){
                curr++;
            }else{
                total += Math.min(prev, curr);
                prev = curr;
                curr =1;
            }

        }
        total += Math.min(prev, curr);

        return total;
    }
}
