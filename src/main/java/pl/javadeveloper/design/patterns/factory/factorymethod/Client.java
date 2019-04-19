package pl.javadeveloper.design.patterns.factory.factorymethod;

public class Client {

    public static void main(String[] args) {
        CarManufacture manufacture = new EuropeanCarManufacture();
        manufacture.manufactureCar("Ferrari");

        manufacture = new AmericanCarManufacture();
        manufacture.manufactureCar("Audi");
    }

}
