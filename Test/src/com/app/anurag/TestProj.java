package com.app.anurag;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestProj {
    public static void main(String[] args) {

        String str = "How          are you today I'm good";
        Arrays.stream(str.split("[/s*|'|]")).forEach(System.out::println);
        System.out.println("str length :  " + str.split("[\\s*|'|]").length);
        System.out.println("str length :  " + Arrays.toString(str.split("[\\s*|'|]")));

        List<String> list = new ArrayList<>();
        list.add("neha");
        list.add("ehan");
        list.add("hane");
        list.add("epam");
        list.add("maep");
        list.add("pame");
        Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(TestProj::sortString));
        map.forEach((k, v) -> System.out.println(k + ":" + v));
        map.entrySet().stream().forEach( (m)-> System.out.println(m.getKey() + ":" + m.getValue()));
    }
    private static String sortString(String str) {

        Map<Character, List<Character>> abc = str.chars().mapToObj( o -> (char) o).collect(Collectors.groupingBy(Function.identity()));
       String sortedString =  str.chars().sorted().mapToObj(o -> String.valueOf((char) o)).collect(Collectors.joining());
        System.out.println(sortedString);

       // System.out.println("sortedString :" + sortedString);

        char[] chars =  str.toCharArray();
        Arrays.sort(chars);

        return new String(chars);


        //  List<Character> chars = Stream.of( str.toCharArray()).flatMap(Collection::stream).collect(Collectors.toList());
        //str.chars().sorted().collect(Collectors.joining()).toString();
        //return str.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
