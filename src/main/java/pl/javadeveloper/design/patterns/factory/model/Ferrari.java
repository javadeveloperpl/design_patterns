package pl.javadeveloper.design.patterns.factory.model;

public class Ferrari implements Car {
    public void start() {
        System.out.println("Ferrari started.");
    }

    public void accelerate() {
        System.out.println("Ferrari accelerated.");
    }

    public void stop() {
        System.out.println("Ferrari stopped.");
    }
}
