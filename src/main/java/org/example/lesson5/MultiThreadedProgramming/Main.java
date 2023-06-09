package org.example.lesson5.MultiThreadedProgramming;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new ThreadA(Integer.toString(i)).start();
        }

        for (int i = 0; i < 5; i++) {
            Thread threadB = new Thread(new ThreadB(Integer.toString(i)));
            threadB.start();
        }
        //2 проблемы, которые возникают в многопоточном коде:
        // 1 - Race Condition (Состояние гонки)
        // например два потока одновременно начинают изменять поле, переменную, которая находится вне класса потоков,
        // тем самым мы получем непредсказуемое поведение, для этого необходимо осуществлять блокировку для потока
        // 2 - DeadLock (Взаимная блокировка)
        // например один поток ждет от другого определенных действий, и наоборот, в результате
        // они оба не могут запуститься и нормально работать, так как ждут определенных условий,
        // который в результате блокировки не наступают
    }
}
