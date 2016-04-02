package com.masyanas.creational.abstractfactory.factory.enginery.germany;

import com.masyanas.creational.abstractfactory.factory.enginery.EngineryFactory;
import com.masyanas.creational.abstractfactory.model.aircraft.Aircraft;
import com.masyanas.creational.abstractfactory.model.aircraft.germany.MesserschmittBf110_Aircraft;
import com.masyanas.creational.abstractfactory.model.tank.Tank;
import com.masyanas.creational.abstractfactory.model.tank.germany.E25_Tank;

public class GermanEngineryFactory implements EngineryFactory {

    @Override
    public Tank createTank() {
        return new E25_Tank();
    }

    @Override
    public Aircraft createAircraft() {
        return new MesserschmittBf110_Aircraft();
    }

}
