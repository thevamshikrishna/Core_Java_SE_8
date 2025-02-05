package Local_Inner_Class;

public class Outer {
    private int length=5;

    public void calculate(){
        final int width=20;
        class Inner{                             //Inner class start
            public void multiply(){
                System.out.println(length*width);
            }
        }                                        //Inner class end and scope ends
        Inner inner=new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        Outer obj=new Outer();
        obj.calculate();
    }

}