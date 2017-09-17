package com.examples;

/**
 * Created by jsubram on 8/9/17.
 */
public class Greeter {

    private void Greet(Greeting helloWorldGreeting) {
        helloWorldGreeting.perform();
    }

    public static void main(String args[]) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();


        //Lambada to assign a lambda to a variable it has to be of part of a interface as below
        // java designers didn't define something called functionType. The ony way we can declare a lambda is
        // is by declaring an interface.
        myLambda myLambda = () -> System.out.print("hello World \n");

        //line 14 and line 19 are same so instead of the below line we can pass in a lambda
        greeter.Greet(helloWorldGreeting);
        Greeting lambdaGreeting = () -> System.out.print("hello World \n ");
        Greeting lambdaGreeting2 = () -> System.out.print("hey am another implementation for the Greeting interface");

        //difference between hello world greeting and lambda greeting? so instead of the below line we can have the one below

        greeter.Greet(helloWorldGreeting);
        greeter.Greet(lambdaGreeting);

        helloWorldGreeting.perform(); //both will print the same
        lambdaGreeting.perform(); //both will print the same

        //lambda behaves as if like the implementation of the interface. we dont need a separate class which will define the implementation
        // there is difference between helloWorldGreeting and lambdaGreeting. we could have created an anonymous inner class like as follows:

        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.print("hello World \n ");
            }
        };

        //lambda looks like an anonymous inner class, with a varied syntax but actually lambda is unique and its not an
        //anonymous inner class

        //lambda is another way without having to create an implementation class.


    }
}


interface myLambda {
    // we can create another method with in the same interface its not working fine. This is something to do with functional interface.
    void foo();
   // void add(int a, int b);
}
