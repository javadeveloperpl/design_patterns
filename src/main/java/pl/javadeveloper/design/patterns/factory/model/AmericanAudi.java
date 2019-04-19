package pl.javadeveloper.design.patterns.factory.model;

public class AmericanAudi implements Car {

    public void start() {
        System.out.println("American Audi started.");
    }

    public void accelerate() {
        System.out.println("American Audi accelerated.");
    }

    public void stop() {
        System.out.println("American Audi stopped.");
    }
}
