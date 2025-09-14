package com.app.neetcode.twopointer;

import java.util.ArrayList;
import java.util.List;

public class LongestStringWithoutRepeat {
    public static void main(String[] args) {
        String s =  "zxyzxyz";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {

        int length = 0;

        int i =0;
        int j=1;
        List<Character> list = new ArrayList<>();
        list.add(s.charAt(i));

        while(j < s.length()){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
                length++;
                j++;
            } else{
              list.remove(i);
              length--;
            }
        }
        return length;
    }
}
