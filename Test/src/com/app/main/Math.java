package com.app.main;

public class Math {
    public static void main(String[] args) {
        System.out.println("output " + calculate("3+4*2/2*2"));
    }

    public static int calculate(String expression) {

        int result = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '*') {
                result = Integer.parseInt(String.valueOf(expression.charAt(i - 1))) * Integer.parseInt(String.valueOf(expression.charAt(i + 1)));
                i++;
                builder = new StringBuilder(builder.toString().substring(0, builder.toString().length() - 1));
                builder.append(result);
            } else {
                builder.append(expression.charAt(i));
            }
        }

        expression = builder.toString();
        builder = new StringBuilder();
        result =0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '/') {
                result = Integer.parseInt(String.valueOf(expression.charAt(i - 1))) / Integer.parseInt(String.valueOf(expression.charAt(i + 1)));
                i++;
                builder = new StringBuilder(builder.toString().substring(0, builder.toString().length() - 1));
                builder.append(result);
            } else {
                builder.append(expression.charAt(i));
            }
        }

        expression = builder.toString();
        builder = new StringBuilder();
        result =0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+') {
                result = Integer.parseInt(String.valueOf(expression.charAt(i - 1))) + Integer.parseInt(String.valueOf(expression.charAt(i + 1)));
                i++;
                builder = new StringBuilder(builder.toString().substring(0, builder.toString().length() - 1));
                builder.append(result);
            } else {
                builder.append(expression.charAt(i));
            }
        }

        expression = builder.toString();
        builder = new StringBuilder();
        result =0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '-') {
                result = Integer.parseInt(String.valueOf(expression.charAt(i - 1))) - Integer.parseInt(String.valueOf(expression.charAt(i + 1)));
                i++;
                new StringBuilder(builder.toString().substring(0, builder.toString().length() - 1));
                builder.append(result);
            } else {
                builder.append(expression.charAt(i));
            }
        }


        return Integer.parseInt(builder.toString());

    }
}
