import java.util.function.BiPredicate;

public class Using_BiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPre=(s1,s2)->s1>s2;
        System.out.println("Is s1 is greate than s2: "+biPre.test(1,2));
    }
}
