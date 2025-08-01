package com.app.adp;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Programs {
    public static void main(String[] args) {

        String name = "Anurag";
        byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
        for (byte b : bytes){
            System.out.println(b);
        }

        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2 = {{1, 4}, {3, 2}, {4, 1}};
        int result [][] = mergeArrays(nums1, nums2);
        for (int i =0; i < result.length; i++){
            System.out.println(result[i][0] + "-" + result[i][1]);
        }

    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i =0; i < nums1.length; i++){
            if(map.get(nums1[i][0]) == null){
                map.put(nums1[i][0], nums1[i][1]);
            }else{
                int num = map.get(nums1[i][0]) + nums1[i][1];
                map.put(nums1[i][0], num);
            }
        }
        for (int i =0; i < nums2.length; i++){
            if(map.get(nums2[i][0]) == null){
                map.put(nums2[i][0], nums2[i][1]);
            }else{
                int num = map.get(nums2[i][0]) + nums2[i][1];
                map.put(nums2[i][0], num);
            }
        }

        int arr [][] = new int[map.size()][2];
        int index =0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            arr[index] [0] = m.getKey();
            arr[index] [1] = m.getValue();
            index++;
        }

        return arr;

    }

}