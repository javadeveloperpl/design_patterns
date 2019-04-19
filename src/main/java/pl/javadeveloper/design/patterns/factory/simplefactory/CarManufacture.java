package pl.javadeveloper.design.patterns.factory.simplefactory;

import pl.javadeveloper.design.patterns.factory.model.Car;

public class CarManufacture {

    private SimpleFactory factory;

    public CarManufacture(SimpleFactory factory) {
        this.factory = factory;
    }

    public void manufactureCar(String type) {
        Car car = factory.createCar(type);
        car.start();
        car.accelerate();
        car.stop();
    }
}
