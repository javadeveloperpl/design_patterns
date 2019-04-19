package pl.javadeveloper.design.patterns.factory.factorymethod;

import pl.javadeveloper.design.patterns.factory.model.Car;

public abstract class CarManufacture {

    public void manufactureCar(String type) {
        Car car = createCar(type);
        car.start();
        car.accelerate();
        car.stop();
    }

    protected abstract Car createCar(String type);
}
