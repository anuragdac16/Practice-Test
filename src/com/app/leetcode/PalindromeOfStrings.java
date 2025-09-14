package com.app.leetcode;

import java.util.HashMap;
import java.util.Map;

public class PalindromeOfStrings {

    public static void main(String[] args) {
        String [] words = {"lc","cl","gg"};
        System.out.println(longestPalindrome(words));

    }

    public static int longestPalindrome(String[] words) {
        Map<String , Integer> map = new HashMap<>();
        int result =0;
        for (int i =0; i < words.length; i++){
            String reverseWord = new StringBuilder(words[i]).reverse().toString();
            if(map.get(reverseWord) == null)
                map.put(words[i], i);
            else{
                map.remove(reverseWord);
                result = result+2;
            }
        }
        return result;
    }
}
