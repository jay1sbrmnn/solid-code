package com.examples;

/**
 * Created by jsubram on 8/9/17.
 */
public class HelloWorldGreeting implements Greeting {


    @Override
    public void perform() {
        System.out.print("Hello World \n ");
    }
}
