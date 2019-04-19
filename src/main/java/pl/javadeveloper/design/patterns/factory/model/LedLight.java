package pl.javadeveloper.design.patterns.factory.model;

public class LedLight implements Light {

    public void produceLight() {
        System.out.println("Producing led light.");
    }
}
