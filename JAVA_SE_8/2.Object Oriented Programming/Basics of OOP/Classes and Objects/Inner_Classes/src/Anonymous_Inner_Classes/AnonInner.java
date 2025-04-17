package Anonymous_Inner_Classes;

public class AnonInner {
    abstract class SaleTodayOnly{
        abstract int dollarsOff();
    }

    public void admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };
       // return basePrice-sale.dollarsOff();
        System.out.println(sale.dollarsOff()-basePrice);
    }

    public static void main(String[] args) {
        AnonInner obj=new AnonInner();
        obj.admission(2);
    }
}
