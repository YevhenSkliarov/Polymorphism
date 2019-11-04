package com.company;

public class Main {

    public static void main(String[] args) {
        generate();
    }

    private static void generate() {
        Person[] person = {new Male(30, "men"), new Female(28, "female")};
        for (Person p : person) {
            p.talk();
        }
    }
}
