package com.examples.excercise;

/**
 * Created by jsubram on 8/21/17.
 */
public class Person {;

    private String firtName;
    private String lastName;
    private int age;


    public Person(String a, String b, int c) {
        this.firtName = a;
        this.lastName = b;
        this.age = c;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firtName='" + firtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
