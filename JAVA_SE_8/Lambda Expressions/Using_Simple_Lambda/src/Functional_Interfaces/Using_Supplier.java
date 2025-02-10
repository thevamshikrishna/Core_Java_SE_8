import java.util.function.Supplier;

public class Using_Supplier {
    public static void main(String[] args) {
        Supplier sup=()->"Hi";
        System.out.println(sup.get());
    }
}
