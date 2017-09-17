package com.examples.string.examples;

/**
 * Created by jsubram on 9/14/17.
 */
abstract class Calculate
{
    abstract int add(int a, int b);
}

public class MainClass
{
    public static void main(String[] args)
    {
        new Calculate()
        {
            @Override
            int add(int a, int b)
            {
                System.out.print(a+b);
                return a+b;
            }
        }.add(11010, 022011);
    }
}

