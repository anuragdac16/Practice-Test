package com.app.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class StringEncryption {
    public static void main(String[] args) {
        String s = "haveaniceday";
        System.out.println(encryption(s));
    }
    public static String encryption(String s) {
        // Write your code here
        s = s.replace(" ","");

        int length = s.length();
        int number = (int) Math.ceil(Math.sqrt(length));
        int index =0 ;
        List<String> list =  new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for(int i =0; i < s.length(); i++){

            if(index == number){
                list.add(builder.toString());
                builder = new StringBuilder();
                index =0;
            }
            builder.append(s.charAt(i));
            index++;
        }
        if(!builder.isEmpty()){
            list.add(builder.toString());
        }
        StringBuilder result = new StringBuilder();

        for(int i =0; i < number; i++){
            for(int j =0; j < number ; j++){
                if(list.size() > j && list.get(j).length() > i ) {
                    result.append(list.get(j).charAt(i));
                }
            }
            result.append(" ");
        }



        return result.substring(0, result.length()-1);
    }
}
