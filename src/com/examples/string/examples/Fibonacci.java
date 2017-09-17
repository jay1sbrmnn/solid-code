package com.examples.string.examples;

/**
 * Created by jsubram on 9/16/17.
 */
public class Fibonacci {

    public static void main(String args[]) {
        allFib(10);
    }
    static void allFib(int n) {
        for(int i=0 ; i< n; i++) {
            System.out.print(i + ":" + fib(i) + "\n");
        }
    }

    static int fib(int i) {
        if(i <= 0 ) return 0;
        if(i == 1) return 1;
        return fib(i-1) + fib(i-2);
    }

    //iterative method

    static int iterativeFib(int i) {
        int fib = 0;
        if(i <= 0 ) return 0;
        if(i == 1) return 1;
        for(int j=0; j < i; j++) {
            fib += j;
        }
    }
}
