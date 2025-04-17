public class Runnable_Interface implements Runnable {
    @Override
    public void run() {
        int x=0;
        for(int i=0;i<10;i++) {
            System.out.println("Thread Using Runnable Interface:"
                    + Thread.currentThread().getName());
            x++;
        }
    }
}
