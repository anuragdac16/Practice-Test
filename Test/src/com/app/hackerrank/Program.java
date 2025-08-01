package com.app.hackerrank;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1, 2, 4, 5, 7, 8, 10);
        int d = 3;
        //System.out.println(beautifulTriplets(d, arr));
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        System.out.println(gradingStudents(grades));

    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for(Integer grade : grades){

            if(grade < 38){
                result.add(grade);
            } else if (grade % 5 > 2){
                int number = (grade / 5) +1 ;
                result.add(number *5);
            } else{
                result.add(grade);
            }
        }
        return result;
    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here

        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< arr.size(); i++){
            map.put(arr.get(i), i);
        }
        int result =0;
        for(int i =0; i< arr.size(); i++){

            for(int j = i+1; j< arr.size(); j++){
                if(arr.get(j) - arr.get(i) == d){
                    if (map.get(d+arr.get(j)) != null){
                        result++;
                    }
                }
            }

        }
        return result;
    }
}

