package com.ihsan;

public class Car {
    private int wheels;
    private String series;
    private int cylinder;
    private boolean engine;

    public Car(String series, int cylinder) {
        this.engine = false;
        this.wheels = 4;
        this.series = series;
        this.cylinder = cylinder;
    }

    public void startEngine() {
        this.engine = true;
        System.out.println("Engine started");
    }

    public void stopEngine() {
        this.engine = false;
        System.out.println("Engine stopped");
    }

    public void accelerate() {
        System.out.println("Start with 10km/h");
    }

    public void brake() {
        System.out.println("Braking");
    }

}
