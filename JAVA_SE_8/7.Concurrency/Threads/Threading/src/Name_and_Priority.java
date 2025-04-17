public class Name_and_Priority extends Thread{
    public static void main(String[] args) {
        Name_and_Priority thread1=new Name_and_Priority();
        thread1.setName("T1");
        thread1.setPriority(Thread.MIN_PRIORITY);

        Name_and_Priority thread2=new Name_and_Priority();
        thread2.setName("T2");
        thread2.setPriority(Thread.NORM_PRIORITY);

        Name_and_Priority thread3=new Name_and_Priority();
        thread3.setName("T3");
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
    }
}