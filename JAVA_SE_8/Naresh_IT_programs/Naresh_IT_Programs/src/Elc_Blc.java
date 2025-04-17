import java.util.Scanner;

//BLC - Business Logic Code with no main method used to write logic only

//ELC - Excecutable Logic Code with main method where execution starts

public class Elc_Blc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius :");
        int r=sc.nextInt();

       // Circle obj=new Circle();

       // System.out.println(obj.areaOfCircle(r));

        double areaOfCircle=Circle.getAreaOfCircle(r);
        System.out.println("Area of Circle is :"+areaOfCircle);

    }
}

class Circle{
    public static double getAreaOfCircle(int r){
        if(r<1)
            return -1;
        else{
            double PI=3.14;
            return PI*r*r;
        }
    }
}
