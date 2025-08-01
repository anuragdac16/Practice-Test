package com.app.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LexicSmallElement {

    public static void main(String[] args) {
       // String s1 = "parker", s2 = "morris", baseStr = "parser";
        String s1 = "leetcode", s2 = "programs", baseStr = "sourcecode";
        System.out.println(smallestEquivalentString(s1, s2, baseStr));
    }
    public static String smallestEquivalentString(String s1, String s2, String baseStr) {
        Map<Character , Character> map = new HashMap<>();


        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) > (s2.charAt(i))){
                char ch = s2.charAt(i);
                while(map.get(ch) != null){
                    ch = map.get(ch);
                }
                map.put(s1.charAt(i), ch);
            }else{
                char ch = s1.charAt(i);
                while(map.get(ch) != null){
                    ch = map.get(ch);
                }
                map.put(s2.charAt(i), ch);
            }
        }
        StringBuilder builder = new StringBuilder();
        for(char ch : baseStr.toCharArray()){
            builder.append(map.get(ch));
        }
        return  builder.toString();
    }
}
