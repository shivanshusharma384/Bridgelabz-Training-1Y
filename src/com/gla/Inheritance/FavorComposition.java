package com.gla.Inheritance;

class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    private final Engine engine = new Engine(); // composition

    void startCar() {
        engine.start();
    }
}
