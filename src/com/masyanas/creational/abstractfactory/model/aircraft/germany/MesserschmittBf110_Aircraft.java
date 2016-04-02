package com.masyanas.creational.abstractfactory.model.aircraft.germany;

import com.masyanas.creational.abstractfactory.model.aircraft.Aircraft;

public class MesserschmittBf110_Aircraft extends Aircraft {

    private static final String NAME = "Messerschmitt Bf.110";
    private static final String COUNTRY = "Germany";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }

}
