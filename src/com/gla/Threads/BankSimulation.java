package com.gla.Threads;

class BankAccount implements Runnable {
    private String name;
    private String type;

    public BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " (" + type + ", Priority: " + Thread.currentThread().getPriority() + ")" +
                    " checking balance... Attempt " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        Thread premium = new Thread(new BankAccount("Alice", "Premium"), "User-Premium");
        Thread regular = new Thread(new BankAccount("Bob", "Regular"), "User-Regular");
        Thread basic = new Thread(new BankAccount("Charlie", "Basic"), "User-Basic");

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}
