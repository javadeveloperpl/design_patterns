package pl.javadeveloper.design.patterns.factory.model;

public class Volvo implements Car {
    public void start() {
        System.out.println("Volvo started.");
    }

    public void accelerate() {
        System.out.println("Volvo accelerated.");
    }

    public void stop() {
        System.out.println("Volvo stopped.");
    }
}
