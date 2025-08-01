package com.app.leetcode;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import java.util.stream.Stream;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        s= "bb";
        Stream<Character> in = s.chars().mapToObj(c -> (char) c);
       Map<Character, Long> map =  s.chars().mapToObj(c -> (char) c)
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       int odd =0;
       int output = 0;
       boolean isOdd = false;
       if(map.entrySet().size() ==1 ){
           System.out.println(s.length());
       }
       for(Map.Entry<Character, Long> m : map.entrySet()){
           if(m.getValue() % 2== 0){
               output += m.getValue();
           }else if(m.getValue() !=1){
               if(!isOdd){
                   output += m.getValue();
                   isOdd = true;
               }else{
                   output += m.getValue() -1;
               }
           }else if(m.getValue() ==1){
               odd = 1;
           }
       }
        output += odd;
       System.out.println(output);

    }
}
