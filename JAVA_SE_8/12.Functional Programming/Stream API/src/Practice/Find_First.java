package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Find_First {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>(List.of("Vamshi","Shyam","Krishna"));

        Optional<String> newStr=str.stream().findFirst();
    }
}
