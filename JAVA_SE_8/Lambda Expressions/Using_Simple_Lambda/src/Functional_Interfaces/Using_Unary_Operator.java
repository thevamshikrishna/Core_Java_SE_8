import java.util.function.UnaryOperator;

public class Using_Unary_Operator {
    public static void main(String[] args) {
        UnaryOperator<Integer> Uni=s->s*s;
        System.out.println(Uni.apply(5));
    }
}
