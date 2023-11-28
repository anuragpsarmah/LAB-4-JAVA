package com.healthify;

import com.healthify.measures.BodyMassIndex;

public class Health implements BodyMassIndex {
    protected Human subject;

    Health(String name, double weight, double height) {
        this.subject = new Human(name, weight, height);
    }

    public double getBMI() {
        // TODO
        // Take care of units
        return this.subject.getWeight() / Math.sqrt((this.subject.getWeight() / 100));
    }

}
