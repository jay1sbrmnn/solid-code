package com.examples.string.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jsubram on 9/14/17.
 */
public class Anagram {
    public static void main(String args[]) {

        checkForAnagramUsingHashMap("abc", "cba");
        checkForAnagramUsingHashMap("hello", "c0ooba");
        checkForAnagramUsingHashMap("hello", "olleh");
        checkForAnagramUsingHashMap("Debit Card", "Bad Credit");

        checkForAnagramUsingArrays("Debit Card", "Bad Credit");
        checkForAnagramUsingArrays("Mother In Law", "Hitler Woman");
    }

    private static void checkForAnagramUsingHashMap(String s1, String s2) {

        boolean status = true;
        char[] charArrayS1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charArrayS2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();

        if(charArrayS1.length != charArrayS2.length) {
            status = false;
        }

        Map<Character, Integer> hm = new HashMap<>();

        //doing the check for the first character array for string 1
        for(int i =0; i<charArrayS1.length; i++) {
            Character keyS1 = charArrayS1[i];
            if(hm.containsKey(keyS1)) {
                hm.put(keyS1, hm.get(keyS1) + 1);
            } else {
                hm.put(keyS1, 1);
            }

            Character keyS2 = charArrayS2[i];
            if(hm.containsKey(keyS2)) {
                hm.put(keyS2, hm.get(keyS2) - 1);
            } else {
                hm.put(keyS2, -1);
            }
        }

        for(int value: hm.values()) {
            if(value !=0) {
                status = false;
            }
        }

        if(status) {
            System.out.print("Its an anagram" + "\n");
        } else {
            System.out.print("Its not an anagram" + "\n");
        }
    }

    private static void checkForAnagramUsingArrays(String s1, String s2) {

        boolean status = true;
        char[] charArrayS1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charArrayS2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();

        if(charArrayS1.length != charArrayS2.length) {
            status = false;
        }

        //sort both the arrays
        //Arrays.sort(charArrayS1);
        //Arrays.sort(charArrayS2);

        Arrays.equals(charArrayS1, charArrayS2);

        if(status) {
            System.out.print("Its an anagram" + "\n");
        } else {
            System.out.print("Its not an anagram" + "\n");
        }
    }

}

