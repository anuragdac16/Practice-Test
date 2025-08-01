package com.app.shift;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintAlphaNumeric {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(new MyRunnableNumber());
        service.execute(new MyRunnableChar());

        service.shutdown();

    }
}

class MyRunnableNumber implements  Runnable{


    @Override
    public void run() {
        for(int i =1 ; i <= 5; i++){
            System.out.println("counter "+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyRunnableChar implements  Runnable{


    @Override
    public void run() {
        for(int i =97 ; i < 102; i++){
            System.out.println("counter "+ (char)i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}