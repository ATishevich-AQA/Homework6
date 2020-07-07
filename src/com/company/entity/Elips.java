package com.company.entity;

public class Elips extends Figure {
    final static String NAME = "Elips";
    int axisA;
    int axisB;

    public Elips(int axisA, int axisB) {
        this.axisA = axisA;
        this.axisB = axisB;
    }

    @Override
    public double perimetr() {
        return ((Math.PI * axisA * (axisA + axisB) + (axisA - axisB)) / axisB) * 4;
    }

    @Override
    public double square() {
        return Math.PI * axisA * axisB;
    }

    @Override
    public String returnName() {
        return NAME;
    }
}
