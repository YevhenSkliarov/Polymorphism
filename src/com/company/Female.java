package com.company;

public class Female extends Person {
    public Female(int age, String gender) {
        super(age, gender);
    }

    @Override
    void talk() {
        System.out.println("Person who talk is a woman");
    }

    @Override
    public String toString() {
        return "Female{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
