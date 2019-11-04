package com.company;

public class Person {
    int age;
    String gender;

    public Person(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    void talk(){
        System.out.println("Person who talk is unknown");
    }
}
