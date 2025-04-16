import java.util.function.BiFunction;

public class Using_BiFunction {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFun=(s1,s2)->s1*s2;
        System.out.println(biFun.apply(3,4));
    }
}
