import java.util.Arrays;
import java.util.List;

public class First_Program {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);

        First_Program firstProgram = new First_Program();

        Arrays.asList(4, 2, 3);
        Arrays.asList(4, 2, 3);
        Arrays.asList(4, 2, 3);
        Arrays.asList(4, 2, 3);
        Arrays.asList(4, 2, 3);
        try {
            Arrays.asList(4, 2, 3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Arrays.asList(4, 2, 3);
        Arrays.asList(4, 2, 3);
        if (true) {
            try {
                int a = 1;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}