import java.util.function.BiConsumer;

public class Using_BiConsumer {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biCon=(s1,s2)-> System.out.println(s1+s2);
        biCon.accept(2,4);
    }
}
