package com.app.neetcode;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength =0;
        int length =0;
        List<Character> list = new ArrayList<>();
        for(int i =0; i < s.length(); i++){
            if(list.contains(s.charAt(i))){
                list.remove(0);
                i--;
                length--;
            }else{
                length++;
                maxLength = Math.max(maxLength, length);
                list.add(s.charAt(i));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
