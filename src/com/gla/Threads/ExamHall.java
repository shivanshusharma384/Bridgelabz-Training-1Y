package com.gla.Threads;

class ExamActivity implements Runnable {
    private String activity;
    private int delay;

    public ExamActivity(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            System.out.println(activity + " state: " + Thread.currentThread().getState());
            Thread.sleep(delay);
            System.out.println(activity + " started.");
            Thread.sleep(3000);
            System.out.println(activity + " completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExamHall {
    public static void main(String[] args) {
        Thread entry = new Thread(new ExamActivity("Student Entry", 0));
        Thread question = new Thread(new ExamActivity("Question Paper Distribution", 5000));
        Thread attendance = new Thread(new ExamActivity("Attendance Marking", 10000));
        Thread collection = new Thread(new ExamActivity("Answer Sheet Collection", 15000));

        question.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);

        entry.start();
        question.start();
        attendance.start();
        collection.start();
    }
}
