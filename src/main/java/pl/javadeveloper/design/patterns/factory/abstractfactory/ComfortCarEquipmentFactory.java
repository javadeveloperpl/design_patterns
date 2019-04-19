package pl.javadeveloper.design.patterns.factory.abstractfactory;

import pl.javadeveloper.design.patterns.factory.model.*;

public class ComfortCarEquipmentFactory implements CarEquipmentFactory {

    public Engine createEngine() {
        return new HybridEngine();
    }

    public Light createLight() {
        return new LedLight();
    }

    public Tire createTire() {
        return new PremiumTire();
    }
}
