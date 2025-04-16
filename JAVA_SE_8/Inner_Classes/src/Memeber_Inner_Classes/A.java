package Memeber_Inner_Classes;

public class A {
    private final int x=10;
    private class B{
        private int x=20;
        protected class C{
             private int x=30;
             public void allTheX(){
                 System.out.println(x);
                 System.out.println(this.x);
                 System.out.println(B.this.x);
                 System.out.println(A.this.x);
             }
         }
    }

    public static void main(String[] args) {
        A a=new A();
        A.B b=a.new B();
        A.B.C c=b.new C();
        c.allTheX();
    }
}
