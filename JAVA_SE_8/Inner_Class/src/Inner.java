class Out{

    public void show() // member inner class

    {

        System.out.println("im the out ");

    }

    class in{

        public void show1()

        {

            System.out.println("im the IN");

        }

    }

    static class in1{  // static nested class

        public  void show2()

        {

            System.out.println("im the in-out");

        }

    }


}

public class Inner {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

//        out o=new out();
//
//        o.show();
//
//
//        out.in i=o.new in();
//
//        i.show1();
//
//        out.in1 i1=new out.in1();
//
//        i1.show2();

        Out obj=new Out();
        obj.show();

        Out.in obj1=obj.new in();
        obj1.show1();

        Out.in1 obj2=new Out.in1();
        obj2.show2();



    }

}