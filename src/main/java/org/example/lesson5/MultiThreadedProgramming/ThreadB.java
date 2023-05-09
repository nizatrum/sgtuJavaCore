package org.example.lesson5.MultiThreadedProgramming;

public class ThreadB implements Runnable {
    private String name;
    public ThreadB(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Я поток " + name + "B");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
