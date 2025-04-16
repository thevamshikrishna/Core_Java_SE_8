import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Count_Of_Elements {
    public static void main(String[] args) {
        Integer[] myNums = {1, 2, 3};
//        List<Integer> myStream = Arrays.asList(myNums);
//        long numElements = myStream.stream().count();
        Stream<Integer> myStream=Arrays.stream(myNums);
        long numElements=myStream.count();
        System.out.println("Number of elements in array are: "+numElements);
    }
}