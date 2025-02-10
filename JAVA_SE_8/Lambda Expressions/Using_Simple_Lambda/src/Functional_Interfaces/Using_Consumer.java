import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Using_Consumer {
    public static void main(String[] args) {
        Consumer<Integer> cons=s-> System.out.println(s);
        cons.accept(8);
    }
}
