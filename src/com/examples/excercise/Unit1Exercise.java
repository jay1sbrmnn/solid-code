package com.examples.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by jsubram on 8/21/17.
 */
public class Unit1Exercise {
    public static void main(String args[]) {
        List<Person> personList = Arrays.asList(
                new Person("first", "last", 31),
                new Person("jay", "sub", 31),
                new Person("karthik", "sankar", 34) // this will create a fixed list, please remember that
        );

        Person person = new Person("heloo", "last" , 344);

        personList.add(person);

        //step 1: sort list by last name
        /*Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareToIgnoreCase(o2.getLastName());
            }
        });*/

        //or we can write the same thing as
         Collections.sort(personList, (Person o1, Person o2) -> o1.getLastName().compareToIgnoreCase(o2.getLastName()));



        //step 2: create a method that prints all the elements in the list

        printAll(personList);

        //step 3: create a method the prints all people name having last name beginning with s
        /*printAllWithCondition(personList, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("s");
            }
        });*/

        printAllWithCondition(personList, p -> p.getLastName().startsWith("s"));


        //best case would be to pass a condition which will return true for all cases, all the things will be printed from it

        printAllWithCondition(personList, p->true);
    }

   /* private static void printAllWithCondition(List<Person> personList, Condition condition) {
        for( Person person : personList) {
            if(condition.test(person))
            System.out.print(person + "\n");
        }
    }*/

    private static void printAllWithCondition(List<Person> personList, Predicate<Person> predicate) {
        for( Person p : personList) {
            if(predicate.test(p))
                System.out.print(p + "\n");
        }
    }

    private static void printAll(List<Person> personList) {
        for( Person person : personList) {
            System.out.print(person + "\n");
        }
    }

    // we dont need to create this interface for making sure the lambda works. We can use the inbuilt interfaces like predicate which works fine.
    /*interface Condition {
        boolean test(Person p);
    }*/
}
