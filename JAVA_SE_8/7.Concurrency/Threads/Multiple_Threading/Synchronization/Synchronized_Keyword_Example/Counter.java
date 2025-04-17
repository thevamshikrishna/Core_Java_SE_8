package Thread_Creation;

public class Counter {
    private int count=0;

    public /*synchronized*/ void increment(){
        count++;
        System.out.println("Incrementing by "+Thread.currentThread().getName()+" count: "+count);
    }

    public int getCount(){
        return count;
    }

}
