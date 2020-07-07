package com.company;

import com.company.entity.*;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Rectangle(2, 3);
        figures[1] = new Squar(1);
        figures[2] = new Triangle(3, 2);
        figures[3] = new Elips(2, 3);
        figures[4] = new Circle(3);


        for (Figure figure : figures) {
            System.out.print("Фигура: " + figure.returnName() + " ");
            System.out.print("Периметр фигуры: " + figure.perimetr() + " ");
            System.out.println("Площадь фигуры: " + figure.square());

        }
        if (figures[0].hashCode() != figures[1].hashCode()) {
            if (!figures[2].toString().equals(figures[3].toString())) {
                if (figures[4].toString().hashCode() != 0) {
                    System.out.println("Hello world");
                }
            }
        }
    }
}
