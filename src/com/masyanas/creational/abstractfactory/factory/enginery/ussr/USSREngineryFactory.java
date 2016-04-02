package com.masyanas.creational.abstractfactory.factory.enginery.ussr;

import com.masyanas.creational.abstractfactory.factory.enginery.EngineryFactory;
import com.masyanas.creational.abstractfactory.model.aircraft.Aircraft;
import com.masyanas.creational.abstractfactory.model.aircraft.ussr.Il2_Aircraft;
import com.masyanas.creational.abstractfactory.model.tank.Tank;
import com.masyanas.creational.abstractfactory.model.tank.ussr.T34_Tank;

public class USSREngineryFactory implements EngineryFactory {

    @Override
    public Tank createTank() {
        return new T34_Tank();
    }

    @Override
    public Aircraft createAircraft() {
        return new Il2_Aircraft();
    }
}
