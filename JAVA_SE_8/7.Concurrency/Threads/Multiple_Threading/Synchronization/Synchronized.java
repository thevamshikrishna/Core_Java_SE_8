package Synchronization;

public class Synchronized extends Thread{

    private int count = 0;

    public synchronized void incrementCount() {
       // count = count + 1;
        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        Synchronized counter = new Synchronized();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.incrementCount();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.incrementCount();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.count);
    }
}