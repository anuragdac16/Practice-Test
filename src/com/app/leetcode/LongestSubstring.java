package com.app.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;
        Set<Character> set = new HashSet<>();
        int startIndex =0;
        int endIndex =0;
        while(endIndex < s.length()){

            if (!set.contains(s.charAt(endIndex))) {
                set.add(s.charAt(endIndex));
                endIndex++;
                longestSubstring = Math.max(longestSubstring, (endIndex-startIndex));
            }else{
                set.remove(s.charAt(startIndex));
                startIndex++;

            }
        }

        return longestSubstring;
    }


}

