package pl.javadeveloper.design.patterns.factory.model;

public class AmericanVolvo implements Car {
    public void start() {
        System.out.println("American Volvo started.");
    }

    public void accelerate() {
        System.out.println("American Volvo accelerated.");
    }

    public void stop() {
        System.out.println("American Volvo stopped.");
    }
}
