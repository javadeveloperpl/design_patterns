package pl.javadeveloper.design.patterns.factory.abstractfactory;

import pl.javadeveloper.design.patterns.factory.model.Engine;
import pl.javadeveloper.design.patterns.factory.model.Light;
import pl.javadeveloper.design.patterns.factory.model.Tire;

public class Client {

    public static void main(String[] args) {
        createEquipment(new EconomyCarEquipmentFactory());
        createEquipment(new ComfortCarEquipmentFactory());
    }

    private static void createEquipment(CarEquipmentFactory carEquipmentFactory) {
        Engine engine = carEquipmentFactory.createEngine();
        engine.produceEngine();

        Light light = carEquipmentFactory.createLight();
        light.produceLight();

        Tire tire = carEquipmentFactory.createTire();
        tire.produceTire();
    }
}
