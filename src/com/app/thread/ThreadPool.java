package com.app.thread;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor executorService = new ThreadPoolExecutor(2, 4, 5, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2), new CustomThreadFactory(), new CustomRejectHandler() );

        executorService.allowCoreThreadTimeOut(true);
        for (int i =0; i < 10; i++){
            executorService.submit( () -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task processed by"+ Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}

