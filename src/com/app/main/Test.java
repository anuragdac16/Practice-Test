package com.app.main;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ab", "bc","dc");
        list.stream().count();
        AtomicInteger count  = new AtomicInteger();

        list.stream().forEach(s -> count.getAndIncrement());
        System.out.println(count);

        String name = "Anurag Gupta";
        StringBuilder builder = new StringBuilder();
        for(int i =name.length()-1; i >= 0; i--){
            builder.append(name.charAt(i));
        }
        System.out.println(builder);
    }
}
