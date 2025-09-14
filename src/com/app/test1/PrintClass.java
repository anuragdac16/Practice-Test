package com.app.test1;

import java.time.LocalDateTime;

public class PrintClass {

    int counter=0;

    int second = LocalDateTime.now().getSecond();

    public void printMethod(){

        if(second == LocalDateTime.now().getSecond()) {

            if (counter < 5) {
                counter++;
                System.out.println(second +" : "+true);

            } else{
                counter++;
                System.out.println(second +" : "+false);
            }

        }else{
            second = LocalDateTime.now().getSecond();
            System.out.println(second +" : "+true);
            counter = 1;
        }



    }
}
