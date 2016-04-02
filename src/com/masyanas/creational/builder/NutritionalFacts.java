package com.masyanas.creational.builder;

public class NutritionalFacts {

    private final int sodium;
    private final int carbo;
    private final int fat;


    private NutritionalFacts(Builder b) {
        this.carbo = b.carbo;
        this.sodium = b.sodium;
        this.fat = b.fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbo() {
        return carbo;
    }

    public int getFat() {
        return fat;
    }

    public static class Builder {

        private int sodium;
        private int carbo;
        private int fat;

        public Builder sodium(int s) {
            this.sodium = s;
            return this;
        }

        public Builder carbo(int c) {
            this.carbo = c;
            return this;
        }

        public Builder fat(int f) {
            this.fat = f;
            return this;
        }

        public NutritionalFacts build() {
            return new NutritionalFacts(this);
        }
    }

}
