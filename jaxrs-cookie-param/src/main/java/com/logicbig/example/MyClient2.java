package com.logicbig.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyClient2 {

    public static void main(String[] args) {
        MyClient1.getRequest("/reset2", Void.class);
        multiThreadedCountRequest("/count2");
        Integer counter = MyClient1.getRequest("/counter2", Integer.class);
        System.out.printf("counter2: %s%n", counter);
    }

    public static void multiThreadedCountRequest(String s) {
        final ExecutorService es = Executors.newFixedThreadPool(1000);
        for (int i = 0; i < 1000; i++) {
            es.execute(() -> MyClient1.getRequest(s, Void.class));
        }
        es.shutdown();
        try {
            es.awaitTermination(5, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}