package com.web.java_dsa.javalearn.advanced.thread;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        int n = 10;
        for (int i=1;i<=n;i++){
            System.out.println(i);

            Thread.sleep(1000);
        }
    }
}
