package pl.javadeveloper.design.patterns.factory.model;

public class EuropeanFerrari implements Car {
    public void start() {
        System.out.println("European Ferrari started.");
    }

    public void accelerate() {
        System.out.println("European Ferrari accelerated.");
    }

    public void stop() {
        System.out.println("European Ferrari stopped.");
    }
}
