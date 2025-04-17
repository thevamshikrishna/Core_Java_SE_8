//public class thread_class extends Thread {
//    public static void main(String[] args) {
//
//        thread_class obj = new thread_class();
//        obj.setName("Alpha");
//
//
//        thread_class obj1 = new thread_class();
//        obj1.setName("Beta");
//
//
//        thread_class obj2 = new thread_class();
//        obj2.setName("Gamma");
//
//        obj.start();
//        obj1.start();
//        obj2.start();
//    }
//
//    @Override
//    public void run() {
//        synchronized (thread_class.class) {
//            for (int i = 0; i <= 10; i++) {
//                    try {
//                        Thread.sleep(1000);
//                        System.out.println(i + " - " + Thread.currentThread().getName());
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//            }
//        }
//    }
//}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class thread_class {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task1 = createTask("Alpha");
        Runnable task2 = createTask("Beta");
        Runnable task3 = createTask("Gamma");

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);

        executorService.shutdown();
    }

    private static Runnable createTask(String threadName) {
        return () -> {
            synchronized (thread_class.class) {
                for (int i = 0; i <= 10; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(i + " - " + threadName);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
    }
}
