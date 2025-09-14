package com.app.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindWords {
    public static void main(String[] args) {
        String [] words = {"leet","code"};
        char x = 'e';
        findWordsContaining(words, x).forEach(System.out::println);
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for (int i =0; i < words.length; i++){
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        return result;
    }
}
