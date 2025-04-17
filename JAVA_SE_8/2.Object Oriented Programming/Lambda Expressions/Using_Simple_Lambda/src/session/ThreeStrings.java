class ThreeStrings {
    public static void main(String[] args) {
        LambdaUsing lu = (a, b, c) -> (a + b + c);
        System.out.println(lu.hello("Hello", " ", "World"));
    }
}

interface LambdaUsing {
    String hello(String a, String b, String c);
}
