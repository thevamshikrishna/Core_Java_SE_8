//Arithematic Exception

public class Example2 {
    public static void main(String[] args) {
        int numerators[] = {10, 200, 30, 40};
        int denominators[] = {1, 2, 0, 4};

        for (int i = 0; i < numerators.length; i++) {
            System.out.println(dive(numerators[i], denominators[i]));
        }
    }
    private static int dive(int i, int i1) {
        try {
            return i / i1;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception :(");
            return -1;
        }
    }
}
