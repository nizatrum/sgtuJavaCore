package org.example.lesson5.MultiThreadedProgramming;

public class ThreadA extends Thread {
    public ThreadA(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Я поток " + getName() + "A");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
