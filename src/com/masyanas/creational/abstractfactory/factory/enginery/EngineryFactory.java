package com.masyanas.creational.abstractfactory.factory.enginery;

import com.masyanas.creational.abstractfactory.model.aircraft.Aircraft;
import com.masyanas.creational.abstractfactory.model.tank.Tank;

public interface EngineryFactory {

    Tank createTank();

    Aircraft createAircraft();

}
