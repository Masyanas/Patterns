package com.masyanas.creational.abstractfactory.model.tank.ussr;

import com.masyanas.creational.abstractfactory.model.tank.Tank;

public class T34_Tank extends Tank {

    private static final String NAME = "T-34";
    private static final String COUNTRY = "USSR";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }

}
