package com.app.java11;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.fill(array, 1, 5, 42); // Fills array from index 1 to 4 with the value 42

        Arrays.stream(array).forEach(System.out::print);

        String str = "   Hello, World!   ";
        System.out.println(str.strip());
        String str1 = "Hi, \nmy name is Anurag \nlooking into this   ";
        str1.lines().forEach(System.out::println);

        if(!str.isBlank()){
            System.out.println(str.stripLeading());
            System.out.println(str.stripTrailing());
             System.out.println(str.repeat(5));
        }

        System.out.println(str.codePointBefore(2));
        // isBlank(), lines(), strip(), stripLeading(), stripTrailing(), repeat(int count), and formatted(Object... args)

    }
}
