package pl.javadeveloper.design.patterns.factory.model;

public class EuropeanAudi implements Car {
    public void start() {
        System.out.println("European Audi started.");
    }

    public void accelerate() {
        System.out.println("European Audi accelerated.");
    }

    public void stop() {
        System.out.println("European Audi stopped.");
    }
}
