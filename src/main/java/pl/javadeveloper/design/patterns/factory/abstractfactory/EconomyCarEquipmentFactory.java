package pl.javadeveloper.design.patterns.factory.abstractfactory;

import pl.javadeveloper.design.patterns.factory.model.*;

public class EconomyCarEquipmentFactory implements CarEquipmentFactory {

    public Engine createEngine() {
        return new PetrolEngine();
    }

    public Light createLight() {
        return new Halogen();
    }

    public Tire createTire() {
        return new BudgetTire();
    }
}
