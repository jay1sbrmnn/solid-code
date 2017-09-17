package com.examples.string.examples;

/**
 * Created by jsubram on 9/14/17.
 */
public class ReverseEachWordInAString {

    public static void main(String args[]) {

        String stringToBeReversed = "hey reverse me";
        String[] strArray = stringToBeReversed.split("\\s");
        for (String str : strArray) {
            char[] charArray = str.toCharArray();
            for(int i=charArray.length -1; i>=0; i--) {
                System.out.print(charArray[i]);
            }
            System.out.print(" ");
        }

    }
}
