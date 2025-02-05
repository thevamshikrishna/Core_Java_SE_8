package Anonymous_Inner_Classes;

class Vehicle
{
    public void run()
    {
        System.out.println("Vehicle is Running!!!");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        //Anonymous inner class approach
        Vehicle car = new Vehicle()
        {
            @Override
            public void run()
            {
                System.out.println("Car is Running!!!");
            }
        };
        //Anonymous inner class approach
        Vehicle bike = new Vehicle()
        {
            @Override
            public void run()
            {
                System.out.println("bike is Running!!!");
            }
        };
        car.run();   bike.run();

    }

}