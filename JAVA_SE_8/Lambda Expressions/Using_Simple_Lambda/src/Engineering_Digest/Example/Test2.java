package Example;

public class Test2 {
    public static void main(String[] args) {

//        Student s=new Student() {
//            @Override
//            public String getBio(String name) {
//                return name +" is Engineering Student!f";
//            }
//        };

       Student s =name-> name+" is Engineering Student!";

        String bio=s.getBio("Ram");
        System.out.println(bio);
    }
}
