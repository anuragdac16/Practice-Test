package com.app.leetcode;

import java.util.Stack;

public class RemoveOccurence {
    public static void main(String[] args) {
        String s = "ACBBD";
        System.out.println(minLength(s));
    }

    public static int minLength(String s) {

        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){

            if(!stack.isEmpty() && ch == 'B'){
                if(stack.peek() == 'A'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            } else if(!stack.isEmpty() && ch == 'D'){
                if(stack.peek() == 'C'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }

        }
        return stack.size();

    }
}
