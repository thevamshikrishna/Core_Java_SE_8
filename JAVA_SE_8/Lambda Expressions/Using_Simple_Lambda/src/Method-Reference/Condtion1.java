//Single Parameter, No Return Type
//If the functional interface method accepts one parameter and returns void, you can use System.out::println as a method reference.

interface Printer {
    void print(String message);
}

class Condtion1 {
    public static void main(String[] args) {
        // Using System.out::println as a method reference
        Printer printer = System.out::println;

        // Calling the method
        printer.print("Hello, Lambda!");
    }
}
