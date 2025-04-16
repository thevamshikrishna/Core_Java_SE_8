package Practice;

import java.util.ArrayList;
import java.util.List;

public class Filtering_Even_Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> list=arr.stream().filter(s->s%2==0).toList();

        System.out.println(list);
    }
}
