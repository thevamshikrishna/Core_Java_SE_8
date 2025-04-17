public class Life_Cycle extends Thread
{
    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Life_Cycle myThread=new Life_Cycle();
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println(myThread.getState());
        Thread.sleep(1000);
        System.out.println(myThread.getState());
        System.out.println(myThread.getState());

    }
}
