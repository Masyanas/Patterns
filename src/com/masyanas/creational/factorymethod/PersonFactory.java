package com.masyanas.creational.factorymethod;

public class PersonFactory {
    public static Person makePerson(String gender, String name) {
        if (gender.equals("male")) {
            return new Male(name);
        } else {
            return new Female(name);
        }
    }
}
