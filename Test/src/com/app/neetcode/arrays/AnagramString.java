package com.app.neetcode.arrays;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s = "jar", t = "jam";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        char []sChars= s.toCharArray();
        char []tChars= t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return new String(sChars).equals(new String(tChars));

    }
}
