// Worker thread implementing Runnable
class WorkerThread implements Runnable {
    private String taskName;

    public WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskName + " is running on thread: " + Thread.currentThread().getName());

        for(int i=0;i<5;i++){
        try {
            // Simulating some work
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Task " + taskName + " was interrupted.");
        }
        System.out.println("Task " + taskName + " has finished.");
    }}
}

// Main class to test the worker thread
public class Main {
    public static void main(String[] args) {
        // Creating and starting a worker thread
        WorkerThread task = new WorkerThread("Worker-1");
        Thread thread = new Thread(task);
        thread.start();

        // Main thread work
        System.out.println("Main thread is running...");
    }
}
