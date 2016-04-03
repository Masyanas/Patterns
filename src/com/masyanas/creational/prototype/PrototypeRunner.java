package com.masyanas.creational.prototype;

public class PrototypeRunner {

    public static void main(String[] args) {
        ItemRegistry registry = new ItemRegistry();
        Item myBook = registry.createBasicItem("Book");
        myBook.setTitle("Custom Title");
    }

}
