package pl.javadeveloper.design.patterns.factory.model;

public class EuropeanVolvo implements Car {
    public void start() {
        System.out.println("European Volvo started.");
    }

    public void accelerate() {
        System.out.println("European Volvo accelerated.");
    }

    public void stop() {
        System.out.println("European Volvo stopped.");
    }
}
