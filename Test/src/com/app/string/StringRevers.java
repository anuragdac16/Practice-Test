package com.app.string;

public class StringRevers {


    public static void main(String[] args) {

        String str = "Hello";

        char [] charArray = new char[str.length()];


        int firstIndex =0;
        int lastIndex = str.length()-1;

        while(firstIndex <= lastIndex){
            char ch = str.charAt(lastIndex);
            charArray[firstIndex] = str.charAt(lastIndex);
            charArray[lastIndex] = str.charAt(firstIndex);

            firstIndex++;
            lastIndex--;
        }


        System.out.println(new String(charArray));
    }
}
