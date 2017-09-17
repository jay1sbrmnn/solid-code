package com.examples.threads.example;

/**
 * Created by jsubram on 9/1/17.
 */

class Runner2 implements Runnable {

    @Override
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
public class demo2 {

    public static void main(String args[]) {
        Thread thread1 = new Thread(new Runner2());
        thread1.start();
        thread1.setName("am thread 1");

        Thread thread2 = new Thread(new Runner2());
        thread2.start();
        thread2.setName("am thread 2");

        Thread thread3 = new Thread(new Runner2());
        thread3.start();
        thread3.setName("am thread 3");

        // this is trying to use the class in demo1 to see if that can be run using the
        Thread thread4 = new Thread(new Runner());
        thread4.start();
        thread4.setName("am thread 4");

        //we cant do this, we need to implement Runner2 only using the Thread class, whereas runner
        //can be used t invoke start without Thread since already extends Thread.
        Runner2 runner = new Runner2();
       // runner.start();


        //another way would be to write anonymous inner class, instead of a separate class up untill java 7
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("hello am an anonymous inner class" + "\n");
            }
        });
        thread5.start();

        Thread thread6 = new Thread(() -> System.out.print("am an lambda for the runnable interface"));
        thread6.start();

        Thread thread7 = new Thread(() -> {
            int i = 0;
            for(int j=0; i<=10; i++) {
                System.out.print("Hello " + i + " am an lambda " + "\n");

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread7.start();
    }
}
