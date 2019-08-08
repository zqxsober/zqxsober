package com.zqxsober.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            executorService.execute(new Runnable() {
                public void run() {
                    System.out.println("task");
                }
            });
            if (i == 5) {
                executorService.shutdown();
            }
        }
    }
}
