package com.gla.Inheritance;

abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}
