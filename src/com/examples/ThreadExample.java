package com.examples;

/**
 * Created by jsubram on 8/21/17.
 */
public class ThreadExample {

    public static void main(String args[]) {

        //this is an classic example of an anonymous inner class. Since Runnable interface has just one method
        //instead of creating a new class/create a new file for the same, write an anonymous inner class
        // just need this once.
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Hello World");
            }
        });

        thread.run();

        System.out.print("\n ");
        // now write an lambda for it, rather than create an inline anonymous class for it
        //create an lambda expression, we can get rid so many lines of the boiler plate code , we saw above.

        Thread thread1 = new Thread(() -> System.out.print("lambda runnable"));
        thread1.run();


        // thread class has been implemented way before java 8,  but it still behaves the same way.
        // lambda behaves like an instance of what it tries to match as an interface.


        // this is the magic for having interface compatibility, but then remember it nly works for the case, where have
        // only one method is there like Runnable.
    }



}
