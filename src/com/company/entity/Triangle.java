package com.company.entity;

import com.company.entity.Figure;

public class Triangle extends Figure {
    int a;
    int c;
    final static String NAME = "Треугольник";

    public Triangle(int a, int c) {
        this.a = a;
        this.c = c;
    }

    @Override
    public double perimetr() {
        return a + a + c;
    }

    @Override
    public double square() {
        double bigestSide = c;
        double lowestSide = a;
        if (a > c) {
            bigestSide = a;
        } else if (c < a) {
            bigestSide = c;
        } else System.out.println("Такие стороны не подходят");
        if (bigestSide != a) {
            lowestSide = a;
        }
        double hight = Math.sqrt(Math.pow(lowestSide, 2) - Math.pow((bigestSide / 2), 2));
        return hight * (bigestSide / 2);
    }

    @Override
    final public String returnName() {
        return NAME;
    }


}
