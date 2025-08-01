package com.app.neetcode.twopointer;

class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
    }
    public static boolean isPalindrome(String s) {


            StringBuilder originalString = new StringBuilder();
            for(int i = 0; i< s.length(); i++){
                if(((int)s.charAt(i)>= 65  && (int)s.charAt(i)<= 90)  || ((int)s.charAt(i)>= 97  && (int)s.charAt(i)<= 122)
                        || ((int)s.charAt(i)>= 48  && (int)s.charAt(i)<= 57)){
                    originalString.append(s.charAt(i));
                }

            }


            if(originalString.toString().equalsIgnoreCase(originalString.reverse().toString())){
                return true;
            }
            return false;

        }


}

