package com.app.info;

public class OddThread implements Runnable{
    @Override
    public void run() {
        for(int i =1; i < 49;i++ ){
            System.out.println(i);
            i++;
        }
    }
}
