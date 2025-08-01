package com.app.main;

public class StringUtility {
    public static void main(String[] args) {
        String a = "Hello ";
        String b = "World ";
        a = b;
        System.out.println(a==b);
        a=a+b;
        System.out.println(a);
        String c = new String("World ");
        System.out.println(b.equals(c));
        System.out.println(b==c);

    }
}
