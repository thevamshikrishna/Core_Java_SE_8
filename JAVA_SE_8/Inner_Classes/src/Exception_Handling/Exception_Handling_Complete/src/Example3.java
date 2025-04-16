import java.io.Serializable;

//OutOfBound Exception
public class Example3 {
    public static void main(String[] args) {
        int numerators[] = {10, 200, 30, 40};
        int denominators[] = {1, 2, 0, 4};
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(dive1(numerators[i], denominators[i]));
            } catch (Throwable e) {
                System.out.println("OutofBound Exceeding limit :(");
            }
        }


        System.out.println("Good job :) ");
    }

    private static int dive1(int i, int i1) {
        try {
            return i / i1;
        } catch (Exception e) {
            System.out.println("Arithematic Exception :(");
            return -1;
        }
    }
}
