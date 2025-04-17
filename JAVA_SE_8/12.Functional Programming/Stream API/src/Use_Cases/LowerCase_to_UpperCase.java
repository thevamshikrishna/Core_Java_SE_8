package Use_Cases;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCase_to_UpperCase {
    public static void main(String[] args) {
        String list[]={"vamshi","nambi","Althaf","Subani"};
        List<String> ltoc= Arrays.stream(list).parallel().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(ltoc);
    }
}
