public class Creating_thread {
    public static void main(String[] args) {
        Test obj=new Test();
        obj.start();
    }
}

class Test extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
