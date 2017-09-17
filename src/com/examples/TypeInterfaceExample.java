package com.examples;

/**
 * Created by jsubram on 8/21/17.
 */
public class TypeInterfaceExample {
    public static void main(String args[]) {
        StringLengthLambda lengthLambda = (String s) -> s.length();
        System.out.print(lengthLambda.getLength("abcdefg test test test"));

        //so instead of passing in like (String s) we can pass in like (s) -> s.length()
        //this is called type interface

        System.out.print("\n");

        StringLengthLambda lengthLambdaWithoutType = (s) -> s.length();

        //one more short cut for this we don't have to specify the parenthesis, if it just one argument

        // one of the very import things lambda does is type inference. That's the reason since we specifically given
        // the interface name we are able to not pass the variable and remove the parenthesis too and make the lambda syntax as simple as possible

        StringLengthLambda withoutParenthesis = s -> s.length();
        printValue(withoutParenthesis);

        System.out.print("\n");

        // or directly like this
        printValue(s -> s.length());

        // we dont have a new FunctionType and we have re used the interface type.
        // The most important reason is backward compatibility. think we they had chosen FunctionType.
        // we have a library in which there is a method which takes the object for the interface, we can pass in a lambda for the same
        // if they had come up with new functionType, the library had to be re written, thats the main reason.

        // we can use lambda in place all the anonymous inner class.

    }

    public static void printValue(StringLengthLambda stringLengthLambda) {
        System.out.print(stringLengthLambda.getLength("heyyyyyyyy"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
