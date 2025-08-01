package com.app.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Program {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable runnable = new MyRunnable();
        Thread runnableThread = new Thread(runnable);
        runnableThread.start();


        ExecutorService service = Executors.newSingleThreadExecutor();
        Future future = service.submit(new MyCallable());
        System.out.println(future.get());
        service.shutdown();
    }
}
