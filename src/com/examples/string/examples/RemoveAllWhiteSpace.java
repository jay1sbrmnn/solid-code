package com.examples.string.examples;

/**
 * Created by jsubram on 9/14/17.
 */
public class RemoveAllWhiteSpace {

    public static void main(String args[]) {
        String stringWithWhiteSpace = "abc              " +
                "dfdgdfgdfgdfg                              ";

        String stringWithoutWhiteSpace = stringWithWhiteSpace.replaceAll("\\s", "");

        System.out.print(stringWithoutWhiteSpace);



        //2nd method
        String result = "";
        for(int i=0; i<stringWithoutWhiteSpace.length(); i++) {
            if(!Character.isWhitespace(stringWithoutWhiteSpace.charAt(i))) {
                result += stringWithoutWhiteSpace.charAt(i);
            }
        }
        System.out.print("\n");
        System.out.print(result);
    }
}
