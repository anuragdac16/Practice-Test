package com.app.test;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

      //  Remove the adjacent duplicate characters from the input string
       // {"abbccdd" -> "a", "bccb" -> "", xwxx -> xw , xwxw -> xwxw}

        String str = "xwxw";
        StringBuilder builder = new StringBuilder();

        List<Character> list = new ArrayList<>();
        list.add(str.charAt(0));
        for(int i =1; i < str.length(); i++){

            if(list.get(list.size()-1) != str.charAt(i)){
                list.add(str.charAt(i));
            }else{
                list.remove(list.size()-1);
            }
        }

        for (Character ch : list){
            builder.append(ch);
        }
        System.out.println(builder.toString());

    }

}
