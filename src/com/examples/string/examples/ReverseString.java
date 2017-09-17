package com.examples.string.examples;

/**
 * Created by jsubram on 9/13/17.
 */
public class ReverseString {

    public static void main(String args[]) {

        //1st method for reversing without string
        StringBuffer sbr = new StringBuffer("hello am here");
        System.out.print(sbr.reverse());

        System.out.print("\n");

        //2nd method

        String stringToBeReversed = "hey reverse me";
        char[] charStrArray = stringToBeReversed.toCharArray();
        for(int i = charStrArray.length -1 ; i >=0 ; i--) {
            String stringToPrint = "";
            stringToPrint += charStrArray[i];
            System.out.print(stringToPrint);
        }

        //3rd method
        System.out.print("\n");
        System.out.print(recursiveReverse(stringToBeReversed));


    }

     static String recursiveReverse(String str) {
        if(str == null || str.length() <=1 ) {
            return str;
        }

        return recursiveReverse(str.substring(1)) + str.charAt(0);
    }
}
