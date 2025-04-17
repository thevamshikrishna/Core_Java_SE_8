public class Main {
    public static void main(String[] args) {
        //System.out.println("Main Thread name:"+Thread.currentThread().getName());
        Thread_Keyword obj=new Thread_Keyword();
        obj.setName("Thread Keyword------Thread");
        obj.start();

        Runnable_Interface obj2=new Runnable_Interface();
        Thread t=new Thread(obj2);
        t.setName("Runnable Interface-------Thread ");
        t.start();


    }
}
