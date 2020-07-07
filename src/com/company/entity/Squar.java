package com.company.entity;

public class Squar extends Figure {
    private int a;
    final static String NAME = "Square";

    public Squar(int a) {
        this.a = a;
    }

    @Override
    public double perimetr() {
        return a * 4;
    }

    @Override
    public double square() {
        return a * a;
    }

    @Override
    public String returnName() {
        return NAME;
    }
}
