package com.iris.test.others;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by mengli on 11/29/19.
 */
public class Test {

    public static void main(String[] args) {
        final String str = "abc";
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("1" + str);
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("2" + str);
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("3" + str);
            }
        });
    }
}