package com.app.main;

import java.util.HashMap;
import java.util.Map;

public class NumberToValue {
    public static void main(String[] args) {

        int number = 12345;
        String value  = getValue(number);
        System.out.println(value);

    }

    private static String getValue(int number) {
        StringBuilder value = new StringBuilder();
        Map<Integer, String > map = getNumberMap();
        String strValue = "" + number;
        if(number > 20){
            int index = 10;
            for(int j = 2 ; j < strValue.length(); j++){
                index = index*10;
            }
            for (int i =0; i< strValue.length(); i++){
                int num = strValue.charAt(i) -'0';
                if(num !=0 && num <9999) {
                    if(strValue.length() - i > 2){
                        value.append(map.get(num));
                        value.append(map.get(index));
                        number = number / 10;
                    }
                    else{
                        value.append(map.get(num * index));
                    }
                    index = index / 10;
                }else{
                    value.append(map.get(index));
                }

            }
        }else{
            return map.get(number);
        }


        return value.toString();

    }

    private static Map<Integer, String> getNumberMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero ");
        map.put(1, "one ");
        map.put(2, "two ");
        map.put(3, "three ");
        map.put(4, "four ");
        map.put(5, "five ");
        map.put(6, "six ");
        map.put(7, "seven ");
        map.put(8, "eight ");
        map.put(9, "nine ");
        map.put(10, "ten ");
        map.put(11, "eleven ");
        map.put(12, "twelve ");
        map.put(13, "thirteen ");
        map.put(14, "fourteen ");
        map.put(15, "fifteen ");
        map.put(16, "sixteen ");
        map.put(17, "seventeen ");
        map.put(18, "eighteen ");
        map.put(19, "nineteen ");
        map.put(20, "twenty ");
        map.put(30, "thirty ");
        map.put(40, "forty ");
        map.put(50, "fifty ");
        map.put(60, "sixty ");
        map.put(70, "seventy ");
        map.put(80, "eighty ");
        map.put(90, "ninety ");
        map.put(100, "hundred ");
        map.put(1000, "thousand ");

        return  map;
    }
}
