package com.app.executor;

public class MyThread extends Thread {

    public void run() {
        for (int i = 11; i <= 15; i++) {
            System.out.println("My thread is running : " + i);
        }
    }
}
