import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Using_Predicate {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        Predicate<Integer> even=s->s%2==0;

        System.out.print("Even Elements are: ");
        for(int x:list){
        boolean result = even.test(x);
        if(result)
        System.out.print(x+" ");
        }

        System.out.println();

        Predicate<Integer> odd=s->s%2!=0;

        System.out.print("Odd Elements are: ");
        for(int x:list){
            boolean result= odd.test(x);
            if(result)
                System.out.print(x+" ");
        }


    }
}
