import java.util.Arrays;
import java.util.stream.Stream;

class Elements_Greater_2{
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6};
        Stream<Integer> mystream=Arrays.stream(arr);
        long x=mystream.filter(s->s>2).count();
        System.out.println("Count of elements Greater than 2: "+x);
    }
}