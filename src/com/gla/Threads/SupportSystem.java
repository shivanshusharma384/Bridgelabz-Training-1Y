package com.gla.Threads;

import java.util.*;

class Ticket extends Thread {
    private int id;
    private String type;
    private int priority;
    private static Random rand = new Random();

    public Ticket(int id, String type, int priority) {
        this.id = id;
        this.type = type;
        this.priority = priority;
        setPriority(priority);
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        int processTime = rand.nextInt(5) + 1;

        try {
            System.out.println("Ticket " + id + " (" + type + ") started by " +
                    Thread.currentThread().getName() +
                    " Priority: " + priority);

            Thread.sleep(processTime * 1000);

            System.out.println("Ticket " + id + " completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Ticket " + id + " took " + (end - start) / 1000 + " seconds");
    }
}

public class SupportSystem {
    public static void main(String[] args) {
        String[] types = {"Critical Bug", "Feature Request", "General Query", "Feedback"};
        int[] priorities = {10, 4, 2, 1};

        List<Ticket> tickets = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int index = i % 4;
            Ticket t = new Ticket(i, types[index], priorities[index]);
            t.setName("Agent-" + i);
            tickets.add(t);
        }

        // Sort by priority (descending)
        tickets.sort((a, b) -> b.getPriority() - a.getPriority());

        for (Ticket t : tickets) {
            t.start();
        }
    }
}
