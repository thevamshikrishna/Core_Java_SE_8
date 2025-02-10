import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
     Integer[] myNums={1,2,3};
        Stream<Integer> myStream= Arrays.stream(myNums);
        long numElements=myStream.count();
        System.out.println(numElements);
        System.out.println(myStream.collect(Collectors.toUnmodifiableList()));
    }
}