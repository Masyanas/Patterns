package com.masyanas.creational.factorymethod;

public class FactoryMethodRunner
{
    public static void main(String[] args)
    {
        Person m = PersonFactory.makePerson("male", "John");
        Person f = PersonFactory.makePerson("female", "Rebecca");
    }
}
