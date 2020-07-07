package com.company.entity;

public class Rectangle extends Figure {
    private int a;
    private int b;
    final static String NAME = "Треугольник";

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimetr() {
        return (a + b) * 2;
    }

    @Override
    public double square() {
        return a * b;
    }

    @Override
    public String returnName() {
        return NAME;
    }

    public void compare() {
        String privet = "привет";
        String hi = "Привет";
        if (privet == hi) {
            System.out.println("Равны, но не очень");
        } else System.out.println("Не равны");
        ;
    }


}
