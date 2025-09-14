package com.app.info;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {
       int [] arr = {2,4,12,6,7,5,8,3};
       //o/p arr = {8,8,8,8,8,8,-1}
        //o/p {12,12,8,8,8,8,3,-1}
        List<String> list = Arrays.asList("venu_gupta","anurag_gupta", "deepak_jain", "deepak_agrawal");
        sortName(list);
        System.out.println(list);

    }

    private static void sortName(List<String> list) {

        Collections.sort(list, new NameComparator());
    }
}

class NameComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.split("_")[1].equals(o2.split("_")[1])){
            return o1.split("_")[0].compareTo(o2.split("_")[0]);
        }
        return o1.split("_")[1].compareTo(o2.split("_")[1]);
    }
}