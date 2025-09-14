package com.app.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountGroup {
    public static void main(String[] args) {

        System.out.println(countLargestGroup(13));

    }
    public static int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max =0;
        for(int i =1; i <= n; i++){
            int key = 0;
            int value =i;
            while (value != 0){
                key += value%10;
                value = value/10;
            }
            map.put(key, map.getOrDefault(key, 0)+1);
            max = Math.max(max, map.get(key));
        }
        int finalMax = max;
        return (int) map.entrySet().stream().filter(m -> m.getValue() == finalMax).count();

    }
}
