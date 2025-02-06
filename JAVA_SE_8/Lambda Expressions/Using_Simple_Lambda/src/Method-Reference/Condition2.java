//Iterating Over a List

import java.util.List;

class Condition2 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Using System.out::println inside forEach()
        names.forEach(System.out::println);
    }
}
