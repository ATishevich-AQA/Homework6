package com.company.entity;

public class Circle extends Figure {
    int axisA;
    final static String NAME = "Круг";

    public Circle(int axisA) {
        this.axisA = axisA;
    }

    @Override
    public double perimetr() {
        return ((Math.PI * axisA * (axisA + axisA) + (axisA - axisA)) / axisA) * 4;
    }

    @Override
    public double square() {
        return Math.PI * axisA * axisA;
    }

    @Override
    public String returnName() {
        return NAME;
    }
}
