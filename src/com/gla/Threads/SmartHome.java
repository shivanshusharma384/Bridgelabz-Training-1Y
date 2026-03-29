package com.gla.Threads;

class Device implements Runnable {
    private String name;
    private int interval;

    public Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " running at " + System.currentTimeMillis());
            try {
                Thread.sleep(interval * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " finished.");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thread temp = new Thread(new Device("Temperature Sensor", 5));
        Thread security = new Thread(new Device("Security Camera", 3));
        Thread light = new Thread(new Device("Light Controller", 4));
        Thread door = new Thread(new Device("Door Lock", 6));

        security.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start();
        security.start();
        light.start();
        door.start();
    }
}
