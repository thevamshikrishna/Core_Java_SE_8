public class Defining_Variable {
    public static void main(String args[]){
        System.out.println("Class Variable :"+Demo.y);

        Demo d1=new Demo();
        System.out.println("Instance Variable :"+d1.x);

        d1.acceptData(999);
    }
}

class Demo{
    int x=120; //Instance Variable(non-static variable)
    static int y=200; //class variable(static field)

    public void acceptData(int z){
        int localVariable=78;
        System.out.println("Parameter Variable: "+z);
        System.out.println("Local Variable: "+localVariable);
    }
}
