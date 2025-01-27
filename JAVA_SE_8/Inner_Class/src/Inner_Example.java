public class Inner_Example {
    public static void main(String args[]){

//        MyOuter obj=new MyOuter();
//        obj.makeInner();

//        MyOuter.MyInner obj1=obj.new MyInner();
//        obj1.seeOuter();

//        MyOuter mo=new MyOuter();
//        MyOuter.MyInner inner=mo.new MyInner();
//        inner.seeOuter();

        MyOuter.MyInner inner =new MyOuter().new MyInner();
        inner.seeOuter();

    }
}

class MyOuter{
    private int x=7;

    public void makeInner(){
        MyInner in=new MyInner();
        in.seeOuter();
    }

    class MyInner{
        public void seeOuter(){
            System.out.println("Outer x is "+x);
        }
    }
}


