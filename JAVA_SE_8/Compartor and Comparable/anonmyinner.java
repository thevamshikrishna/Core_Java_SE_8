package Anonymous_Inner_Classes;

class anony
{
    public void show()
    {
        System.out.println(" im the showwww");
    }

    public void run() {
        // TODO Auto-generated method stub
    }
}

public class anonmyinner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //anonymous inner class

        anony a=new anony()
        {
            public void  run()
            {
                System.out.println(" im running");
            }
        };
        a.show();
        a.run();
    }

}
