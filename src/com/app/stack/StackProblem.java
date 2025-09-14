package com.app.stack;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Stack;

public class StackProblem {

    public static void main(String[] args) {
        String str = "(([({})])";

        LocalDate date = LocalDate.of(2024, 8,20);
        System.out.println(date);
        System.out.println(date.minus(90, ChronoUnit.DAYS));
        boolean isValid = validInput(str);
        System.out.println(isValid);

    }

    private static boolean validInput(String str) {

        boolean isValid = true;
        Stack<Character> stack = new Stack<>();

        if(str.charAt(0) == '(' || str.charAt(0) == '[' || str.charAt(0) =='{'){
            stack.add(str.charAt(0));
        }else{
            return false;
        }

        for(int i =1; i < str.length(); i++){

            switch(str.charAt(i)){
                case '(':
                case '{':
                case '[':
                    stack.push(str.charAt(i));
                    break;
                case ')':
                    if(!stack.isEmpty() && stack.peek().equals('(')){
                        stack.pop();
                    }else{
                        isValid = false;
                    }
                    break;
                case '}':
                    if(!stack.isEmpty() && stack.peek().equals('{')){
                        stack.pop();
                    }else{
                        isValid = false;
                    }
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.peek().equals('[')){
                        stack.pop();
                    }else{
                        isValid = false;
                    }
                    break;
            }

            if(Boolean.FALSE.equals(isValid)){
                break;
            }

        }
        if(isValid == true && !stack.isEmpty()){
            isValid = false;
        }
        return isValid;

    }
}
