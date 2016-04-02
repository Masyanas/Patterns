package com.masyanas.creational.builder;

public class BuilderRunner {

    public static void main(String[] args) {
        NutritionalFacts n = new NutritionalFacts.Builder().sodium(10).fat(20).carbo(30).build();
    }
}
