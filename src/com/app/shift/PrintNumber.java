package com.app.shift;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumber {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(new MyRunnable1());
        service.execute(new MyRunnable2());

        service.shutdown();

    }
}

class MyRunnable1 implements  Runnable{


    @Override
    public void run() {
        for(int i =1 ; i <= 5; i++){
            System.out.println("counter "+ i);
        }
    }
}
class MyRunnable2 implements  Runnable{


    @Override
    public void run() {
        for(int i =6 ; i <= 10; i++){
            System.out.println("counter "+ i);
        }
    }
}