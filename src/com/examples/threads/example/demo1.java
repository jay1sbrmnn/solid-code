package com.examples.threads.example;

/**
 * Created by jsubram on 9/1/17.
 */

// 2 ways of starting a thread class.

class Runner extends Thread {

    //thread class has a method class run we need to override that.
    public void run() {
        int i = 0;
        for(int j=0; i==0; i++) {
           System.out.print("Hello " + i + "\n");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class demo1 {

    public static void main(String args[]) {
        Runner runner1 = new Runner();
        runner1.start();
        runner1.setName("am number 1");

        Runner runner2 = new Runner();
        runner2.start();
        runner2.setName("am number 2");

        Runner runner3 = new Runner();
        runner3.start();
        runner3.setName("am number 3");
    }
}
