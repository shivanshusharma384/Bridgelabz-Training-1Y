package com.gla.Method;

public class Car {
    String color;
    String company;
    String model;
    String type;

    public static void main(String[] args){
        Car c = new Car();
        c.color = "Red";
        c.company = "BMW";
        c.model = "M5";
        c.type = "racing car";

        System.out.println(c.color);
        System.out.println(c.company);
        System.out.println(c.model);
        System.out.println(c.type);
    }
}
