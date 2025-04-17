public class Using_Runnable_Interface {
    public static void main(String[] args) {
        Runnable ref=new Runnable() {
            @Override
            public void run() {
                try{
                    for(int i=1;i<=10;i++){
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        };
        Thread thread=new Thread(ref);
        thread.start();
    }
}
