package pl.javadeveloper.design.patterns.factory;

import pl.javadeveloper.design.patterns.factory.model.Audi;
import pl.javadeveloper.design.patterns.factory.model.Car;
import pl.javadeveloper.design.patterns.factory.model.Ferrari;
import pl.javadeveloper.design.patterns.factory.model.Volvo;

public class CarManufacture {

    public void manufactureCar(String type) {
        Car car;
        if (type.equals("Audi")) {
            car = new Audi();
        } else if (type.equals("Volvo")) {
            car = new Volvo();
        } else if (type.equals("Ferrari")) {
            car = new Ferrari();
        } else {
            throw new IllegalArgumentException("Unknown car." + type);
        }

        car.start();
        car.accelerate();
        car.stop();
    }
}
