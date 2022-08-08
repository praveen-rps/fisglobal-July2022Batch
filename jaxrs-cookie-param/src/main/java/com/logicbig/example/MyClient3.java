package com.logicbig.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyClient3 {
    public static void main(String[] args) {
        MyClient1.getRequest("/reset3", Void.class);
        MyClient2.multiThreadedCountRequest("/count3");
        Integer counter = MyClient1.getRequest("/counter3", Integer.class);
        System.out.printf("counter3: %s%n", counter);
    }
}