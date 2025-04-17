public class Stream_Methods {
}

/*

1. Intermediate Operations (Return a Stream)
These methods transform the stream and return a new stream.

        Method	                         Description

filter(Predicate<T>)	          Filters elements based on a condition
map(Function<T, R>)	              Transforms elements from one type to another
flatMap(Function<T, Stream<R>>)   Flattens nested structures (e.g., List of Lists)
distinct()	                      Removes duplicate elements
sorted()	                      Sorts elements in natural order
sorted(Comparator<T>)	          Sorts elements using a custom comparator
peek(Consumer<T>)	              Performs an action on each element (useful for debugging)
limit(long n)	                  Truncates the stream to the first n elements
skip(long n)	                  Skips the first n elements


2️⃣ Terminal Operations (Produce a Result)
These methods consume the stream and produce a result.

        Method	                                      Description
collect(Collector<T, A, R>)	               Converts the stream into a collection (e.g., List, Set, Map)
forEach(Consumer<T>)	                   Iterates over each element
toArray()	                               Converts the stream into an array
reduce(BinaryOperator<T>)	               Reduces elements to a single value (e.g., sum, min, max)
count()	                                   Counts the number of elements
min(Comparator<T>)	                       Finds the minimum element
max(Comparator<T>)	                       Finds the maximum element
findFirst()	                               Returns the first element (if any)
findAny()	                               Returns any element (useful in parallel streams)
allMatch(Predicate<T>)	                   Checks if all elements match a condition
anyMatch(Predicate<T>)	                   Checks if any element matches a condition
noneMatch(Predicate<T>)	                   Checks if no elements match a condition


3️⃣ Short-Circuiting Operations
Some operations stop processing once the result is determined.

limit(n)
findFirst()
findAny()
anyMatch()
allMatch()
noneMatch()
These operations can improve performance when working with large datasets.

4️⃣ Special Streams
Java provides specialized streams for primitive types, with their own methods:

IntStream (for int values)
LongStream (for long values)
DoubleStream (for double values)
Additional Methods for Primitive Streams:

sum() (Computes sum of elements)
average() (Finds average)
summaryStatistics() (Provides min, max, count, sum, and average)


Example Code
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1, 8, 5);

        // Intermediate + Terminal Operations
        List<Integer> sortedList = numbers.stream()
                .filter(n -> n > 2) // Filter numbers greater than 2
                .sorted()           // Sort the numbers
                .distinct()         // Remove duplicates
                .collect(Collectors.toList()); // Collect as a List

        System.out.println(sortedList); // Output: [3, 5, 8]

        // Sum using reduce
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum); // Output: Sum: 32
    }
}*/