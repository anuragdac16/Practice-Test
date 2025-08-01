package com.app.dsa;

public class StarPrint {

    public static void main(String[] args) {

//        for(int i =0; i<5; i++){
//            for(int j =0; j<i+1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        System.out.println();
        System.out.println("-------------------");
        System.out.println();



        for (int i = 1; i <= 5; i++) {
            // Print spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("   ");
            }

            // Print asterisks
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(" * ");
            }

            // Move to the next line
            System.out.println();
        }
    }

}
