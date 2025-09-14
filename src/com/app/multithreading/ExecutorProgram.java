package com.app.multithreading;

import java.util.concurrent.*;

public class ExecutorProgram {

    public static void main(String[] args) throws ExecutionException, InterruptedException {



        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CompletableFuture<String> completableFutureResult = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "CompletableFuture Result";
        }, executorService);

        completableFutureResult.thenAccept(result -> {
                    System.out.println("Promise Result: " + result);
                })
                .exceptionally(throwable -> {
                    System.err.println("Error occurred: " + throwable.getMessage());
                    return null;
                });

        System.out.println("Doing other tasks...");

        executorService.shutdown();





//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//
//        for (int i =0; i < 100; i++){
//            executorService.submit(() -> {
//                System.out.println("Task  : " + Thread.currentThread().getName());
//            });
//            Thread.sleep(1000);
//        }
//
//
//
//
//
//        executorService.submit(() -> {
//            System.out.println("Task 1 : "+Thread.currentThread().getName());
//        });
//        executorService.submit(() -> {
//            System.out.println("Task 2 : "+Thread.currentThread().getName());
//        });
//        executorService.submit(() -> {
//            System.out.println("Task 3 : "+Thread.currentThread().getName());
//        });
//
//       Future<String> threadName = executorService.submit(() -> {
//           System.out.println("Task 4 : "+Thread.currentThread().getName());
//           return Thread.currentThread().getName();
//       });
//       System.out.println(threadName.get());
//
//       executorService.execute(() -> {
//           System.out.println("Execute 1  : "+Thread.currentThread().getName());
//       });
//
//       executorService.execute(() -> {
//           System.out.println("Execute 2  : "+Thread.currentThread().getName());
//       });
//       executorService.execute(() -> {
//           System.out.println("Execute 3  : "+Thread.currentThread().getName());
//       });executorService.execute(() -> {
//           System.out.println("Execute 4  : "+Thread.currentThread().getName());
//       });executorService.execute(() -> {
//           System.out.println("Execute 5  : "+Thread.currentThread().getName());
//       });
//
//
//
//       executorService.shutdown();
    }
}