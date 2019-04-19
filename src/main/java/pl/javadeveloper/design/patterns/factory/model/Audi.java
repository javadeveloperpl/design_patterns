package pl.javadeveloper.design.patterns.factory.model;

public class Audi implements Car {
    public void start() {
        System.out.println("Audi started.");
    }

    public void accelerate() {
        System.out.println("Audi accelerated.");
    }

    public void stop() {
        System.out.println("Audi stopped.");
    }
}
