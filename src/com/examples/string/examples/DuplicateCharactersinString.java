package com.examples.string.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by jsubram on 9/14/17.
 */
public class DuplicateCharactersinString {

    public static void main(String args[]) {

        String stringToBeReversed = " Better Butter";
        char[] charArray = stringToBeReversed.toCharArray();
        Map<Character, Integer> hashMap = new HashMap();
        System.out.print("Duplicate values are" + "\n");
        for(int i=charArray.length -1; i>=0; i--) {
            if(hashMap.get(charArray[i]) == null) {
                hashMap.put(charArray[i], 1);
            } else {
                hashMap.put(charArray[i], hashMap.get(charArray[i]) + 1);
            }
        }

        for (Entry<Character, Integer> entry: hashMap.entrySet()) {

            if(entry.getValue() > 1) {
                System.out.print("the character " + entry.getKey() + " number of times repeated " + entry.getValue());
                System.out.print("\n");
            }
        }
    }
}
