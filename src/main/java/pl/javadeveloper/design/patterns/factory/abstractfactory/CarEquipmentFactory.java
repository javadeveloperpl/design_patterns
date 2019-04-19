package pl.javadeveloper.design.patterns.factory.abstractfactory;

import pl.javadeveloper.design.patterns.factory.model.Engine;
import pl.javadeveloper.design.patterns.factory.model.Light;
import pl.javadeveloper.design.patterns.factory.model.Tire;

public interface CarEquipmentFactory {
    Engine createEngine();
    Light createLight();
    Tire createTire();
}
