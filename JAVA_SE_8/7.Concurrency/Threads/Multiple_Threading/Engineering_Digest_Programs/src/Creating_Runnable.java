public class Creating_Runnable {
    public static void main(String[] args) {
        Test1 obj=new Test1();
        Thread myTread =new Thread(obj);
        myTread.start();
    }
}
class Test1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
