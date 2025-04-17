import java.util.concurrent.locks.ReentrantLock;

public class Synchronization_in_Threads extends Thread {
    static int count = 0;
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Synchronization_in_Threads thread1 = new Synchronization_in_Threads();
        Synchronization_in_Threads thread2 = new Synchronization_in_Threads();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count); 
    }

    public void run() {
        for (int i = 0; i <= 100000; i++) {
            lock.lock();  // Acquire lock
            try {
                count++;
            } finally {
                lock.unlock(); // Release lock
            }
        }
    }
}


//public class Synchronization_in_Threads extends Thread {
//    static int count=0;
//    public static void main(String[] args) throws InterruptedException {
//        Synchronization_in_Threads thread1=new Synchronization_in_Threads();
//        thread1.start();
//        Synchronization_in_Threads thread2=new Synchronization_in_Threads();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println(count);
//    }
//
//    public void run(){
//        for(int i=0;i<=100000;i++){
//            count++;
//        }
//    }
//}