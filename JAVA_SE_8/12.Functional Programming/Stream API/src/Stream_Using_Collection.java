import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Using_Collection {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
//        List<Integer> filteredList=list.stream().filter(s->s%2==0).toList();
//        System.out.println("Even Elements from List are: "+filteredList);
//        System.out.println("Even Elements from List are: "+list.stream().filter(s->s%2==0).toList());
        System.out.println("Even Elements from List are: "+list.stream().toList());
    }
}
