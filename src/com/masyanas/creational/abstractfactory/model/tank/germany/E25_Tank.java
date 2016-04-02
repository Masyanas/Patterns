package com.masyanas.creational.abstractfactory.model.tank.germany;

import com.masyanas.creational.abstractfactory.model.tank.Tank;

public class E25_Tank extends Tank {

    private static final String NAME = "E-25";
    private static final String COUNTRY = "Germany";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }

}
