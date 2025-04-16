public class Thread_Keyword extends Thread{
    public void run(){
        int x=0;
        for(int i=0;i<10;i++) {
            System.out.println("Thread Using Thread Keyword:"
                    + Thread.currentThread().getName());
            x++;
        }
    }
}
