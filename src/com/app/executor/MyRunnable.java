package com.app.executor;

public class MyRunnable implements Runnable{

    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("My Runnable is running : " + i);
        }
    }
}
