public class Custom_Exception {
    private double balance;

    public Custom_Exception(double amount) throws InsufficientException {
        this.balance=amount;
    }

    public static void main(String[] args) throws InsufficientException {
        Custom_Exception obj=new Custom_Exception(5000);
        obj.withdraw(4000);
    }

    public void withdraw(double amount)
        if(amount>balance){
            throw new InsufficientException();
        }
        balance-=amount;
    }
}