package com.app.main;

import java.util.HashMap;
import java.util.Map;

public class NumberToString {
    public static void main(String[] args) {
        int number = 1234;
        String value = numberToString(number);
        System.out.println(value);
    }

    private static String numberToString(int number) {
        StringBuilder value = new StringBuilder();
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");

        String strNumber = String.valueOf(number);
        for (char ch : strNumber.toCharArray()){
            value.append(map.get((int) ch -'0'));
        }
        return value.toString();
    }
}
