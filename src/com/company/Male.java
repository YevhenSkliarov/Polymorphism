package com.company;

public class Male extends Person {
    public Male(int age, String gender) {
        super(age, gender);
    }

    @Override
    void talk() {
        System.out.println("Person who talk is a men");
    }

    @Override
    public String toString() {
        return "Male{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
