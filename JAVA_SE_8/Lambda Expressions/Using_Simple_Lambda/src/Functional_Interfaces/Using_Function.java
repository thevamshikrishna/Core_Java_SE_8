import java.util.function.Function;

public class Using_Function {
    public static void main(String[] args) {
        Function<String,Integer> fun= s->s.length();
        System.out.println("Length of String: "+fun.apply("Vamshi"));
    }
}
