package Life_Cycle_Of_Thread;

public class Demo extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Demo t1=new Demo();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }

    @Override
    public void run() {

        System.out.println("Running");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //
    }
}
