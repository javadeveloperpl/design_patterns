package pl.javadeveloper.design.patterns.factory.factorymethod;

import pl.javadeveloper.design.patterns.factory.model.Car;
import pl.javadeveloper.design.patterns.factory.model.EuropeanAudi;
import pl.javadeveloper.design.patterns.factory.model.EuropeanFerrari;
import pl.javadeveloper.design.patterns.factory.model.EuropeanVolvo;

public class EuropeanCarManufacture extends CarManufacture {

    protected Car createCar(String type) {
        if (type.equals("Audi")) {
            return new EuropeanAudi();
        } else if (type.equals("Volvo")) {
            return new EuropeanVolvo();
        } else if (type.equals("Ferrari")) {
            return new EuropeanFerrari();
        } else {
            throw new IllegalArgumentException("Unknown car." + type);
        }
    }
}
