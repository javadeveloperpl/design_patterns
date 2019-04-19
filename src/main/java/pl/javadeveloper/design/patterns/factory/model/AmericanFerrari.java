package pl.javadeveloper.design.patterns.factory.model;

public class AmericanFerrari implements Car {
    public void start() {
        System.out.println("American Ferrari started.");
    }

    public void accelerate() {
        System.out.println("American Ferrari accelerated.");
    }

    public void stop() {
        System.out.println("American Ferrari stopped.");
    }
}
