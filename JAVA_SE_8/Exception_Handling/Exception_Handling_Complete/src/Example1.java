public class Example1 {
    public static void main(String[] args) {
        int numerators[] = {10, 200, 30, 40};
        int denominators[] = {1, 2, 0, 4};

        for (int i = 0; i < numerators.length; i++) {
            try {
                System.out.println(dive(numerators[i], denominators[i]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    private static int dive(int i, int i1) {
            return i / i1;
    }
}
