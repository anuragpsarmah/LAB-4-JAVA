package com.healthify;

public class Human {
    private String name;
    private double weight;
    private double height;

    Human(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
