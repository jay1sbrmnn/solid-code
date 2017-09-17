package com.examples.string.examples;

/**
 * Created by jsubram on 9/16/17.
 */
public class Factorial {

    public static void main(String args[]) {
        allFac(10);
    }
    static void allFac(int n) {
        for(int i=0 ; i< n; i++) {
            System.out.print(i + ":" + fac(i) + "\n");
        }
    }

    static int fac(int i) {
        if(i < 0 ) return -1;
        if(i == 0) return 1;
        return i * fac(i-1);
    }
}
