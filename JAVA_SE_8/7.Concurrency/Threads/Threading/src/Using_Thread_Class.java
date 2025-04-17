public class Using_Thread_Class {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{

                for (int i = 1; i <= 10; i++) {
                    try {
                        System.out.println(i);
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
        });

        thread.start();
    }
}
