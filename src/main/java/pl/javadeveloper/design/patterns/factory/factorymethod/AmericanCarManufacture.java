package pl.javadeveloper.design.patterns.factory.factorymethod;

import pl.javadeveloper.design.patterns.factory.model.AmericanAudi;
import pl.javadeveloper.design.patterns.factory.model.AmericanFerrari;
import pl.javadeveloper.design.patterns.factory.model.AmericanVolvo;
import pl.javadeveloper.design.patterns.factory.model.Car;

public class AmericanCarManufacture extends CarManufacture {

    protected Car createCar(String type) {
        if (type.equals("Audi")) {
            return new AmericanAudi();
        } else if (type.equals("Volvo")) {
            return new AmericanVolvo();
        } else if (type.equals("Ferrari")) {
            return new AmericanFerrari();
        } else {
            throw new IllegalArgumentException("Unknown car." + type);
        }
    }
}
