package com.app.shift;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class WaitNotify {


    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        AtomicInteger producerCounter = new AtomicInteger();
        AtomicInteger consumerCounter = new AtomicInteger();
        for(int i =0; i < 50; i++){
            executorService.submit( () -> {

                producerCounter.getAndIncrement();
                System.out.println("producer played : "+producerCounter);
                return "producer played"+producerCounter;
            });
            i++;
            executorService.wait(2000);
        }

        for(int i =1; i < 49; i++){
            executorService.notify();
            executorService.submit( () -> {
                consumerCounter.getAndIncrement();
                System.out.println("consumer played "+ consumerCounter);
                return "consumer played "+ consumerCounter;
            });
            i++;
        }

        executorService.shutdown();
    }

}
