package Memeber_Inner_Classes;

public class CaseOfThePrivateInterface {
    private interface secret{
        public void shh();
    }
    class DontTell implements secret{
        public void shh(){
            System.out.println("Success");
        }
    }

    public static void main(String[] args) {
        CaseOfThePrivateInterface obj=new CaseOfThePrivateInterface();
        CaseOfThePrivateInterface.DontTell obj1=obj.new DontTell();
        obj1.shh();
    }
}
