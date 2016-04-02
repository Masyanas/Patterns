package com.masyanas.creational.abstractfactory;

import com.masyanas.creational.abstractfactory.factory.enginery.EngineryFactory;
import com.masyanas.creational.abstractfactory.factory.enginery.germany.GermanEngineryFactory;
import com.masyanas.creational.abstractfactory.factory.enginery.ussr.USSREngineryFactory;
import com.masyanas.creational.abstractfactory.model.aircraft.Aircraft;
import com.masyanas.creational.abstractfactory.model.tank.Tank;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        EngineryFactory engineryFactory = new USSREngineryFactory();

        System.out.println("USSR enginery:");
        showEnginery(engineryFactory);

        System.out.println();

        System.out.println("German enginery:");
        engineryFactory = new GermanEngineryFactory();
        showEnginery(engineryFactory);
    }

    public static void showEnginery(EngineryFactory engineryFactory) {
        Tank tank = engineryFactory.createTank();
        System.out.println(tank.getDescription());

        Aircraft aircraft = engineryFactory.createAircraft();
        System.out.println(aircraft.getDescription());
    }
}
