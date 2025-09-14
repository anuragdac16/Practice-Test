package com.app.shift;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ThreadProgram {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String input = "2024-02-05 04:41:46 WARN  ObservabilityHandler - Start collection components data\n" +
                "2024-02-05 04:41:46 INFO  MetricCollector ---------- collecting  ----------\n" +
                "2024-02-05 04:41:46 ERROR ObservabilityHandler - tokenArray : 31\n" +
                "2024-02-05 04:41:46 INFO  MetricCollector ---------- collection 1 finished for agents in 0.368 seconds ----------\n" +
                "2024-02-05 04:41:46 DEBUG ObservabilityHandler - metrics collection 1 finished for agents in 0.368 seconds\n" +
                "2024-02-05 04:41:46 WARN  ObservabilityHandler - clear all existing data on the system...\n" +
                "2024-02-05 04:41:46 ERROR ObservabilityHandler - tokenArray : 19Output:";

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<String> logArray = input.lines().collect(Collectors.toList());
        AtomicInteger warnCounter = new AtomicInteger();
        AtomicInteger infoCounter = new AtomicInteger();
        AtomicInteger debugCounter = new AtomicInteger();
        AtomicInteger errorCounter = new AtomicInteger();

        for(String logs : logArray){
            if(logs.contains("WARN")) {
                executorService.execute(() -> warnCounter.getAndIncrement());
            }else if(logs.contains("INFO")){
                executorService.execute(() -> infoCounter.getAndIncrement());
            } else if(logs.contains("DEBUG")){
                executorService.execute(() -> debugCounter.getAndIncrement());
            }else if(logs.contains("ERROR")){
                executorService.execute(() -> errorCounter.getAndIncrement());
            }
        }


        System.out.println("WARN - "+ warnCounter );
        System.out.println("INFO - "+ infoCounter );
        System.out.println("DEBUG -"+ debugCounter );
        System.out.println("ERROR - "+ errorCounter);

        executorService.shutdown();
    }
}
