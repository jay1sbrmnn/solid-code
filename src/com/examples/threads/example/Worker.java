package com.examples.threads.example;

/**
 * Created by jsubram on 9/1/17.
 */

public class Worker {
    public static void main(String args[]) {
        Worker worker = new Worker();
        worker.doWork();
    }
    private int count = 0;

    //if we dont have synchronized keyword here like below, the count which is getting displayed
    //wont be the same every single time, because one thread overwrites the value before the
    //the other thread has an updated value.

    //java has an intrinsic lock also an mutex. the thread has to acquire the intrinsic lock. only one thread can acquire it.
    // if one thread acquires it , and if another thread wants it , then it needs to wait.


    //when we have multiple threads
    public synchronized  void increment() {
        count++;
    }

    public void doWork() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Count is: " + count);
    }
}
