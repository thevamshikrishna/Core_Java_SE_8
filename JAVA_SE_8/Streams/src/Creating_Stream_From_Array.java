import java.util.Arrays;
import java.util.stream.Stream;

public class Creating_Stream_From_Array {
    public static void main(String[] args) {
        String dogs[]={"Boi","Zooey","Charis"};
       // Stream<String> dogStream= Arrays.stream(dogs);
        Stream<String> dogStream=Stream.of(dogs);
        System.out.println("Number of Dogs: "+dogStream.count());
    }
}
