package Memeber_Inner_Classes;

public class Outer {

    private String greeting="Hi";

    protected class Inner{
        public int repeat=3;
        public void go(){
            for(int i=0;i<repeat;i++){
                System.out.println(greeting);
            }
        }
    }

    public void callInner(){
        Inner obj=new Inner();
        obj.go();
    }
    public static void main(String[] args) {
       Outer obj=new Outer();
       //obj.callInner();
        Inner inner=obj.new Inner();
        inner.go();
    }
}