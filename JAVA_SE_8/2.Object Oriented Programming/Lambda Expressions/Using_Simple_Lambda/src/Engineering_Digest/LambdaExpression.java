public class LambdaExpression {
    public static void main(String args[]){

//        Runnable runnable=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        };
//        Thread t1=new Thread(runnable);
//        t1.start();

//        Runnable runnable = () -> System.out.println("Hello");
//        Thread t1 = new Thread(runnable);


        Thread t1 = new Thread(()->System.out.println("Hello"));
        t1.start();
    }


}
