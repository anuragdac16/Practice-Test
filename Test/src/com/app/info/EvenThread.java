package com.app.info;

public class EvenThread extends Thread{

    public void run() {
        for(int i =0; i < 50;i++ ){
            System.out.println(i);
            i++;
        }
    }
}
