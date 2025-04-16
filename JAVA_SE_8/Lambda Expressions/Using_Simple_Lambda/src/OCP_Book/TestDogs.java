import java.util.ArrayList;
import java.util.function.Predicate;

public class TestDogs {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("boi", 30, 6));
        dogs.add(new Dog("charis", 120, 7));
        dogs.add(new Dog("clover", 35, 12));
        dogs.add(new Dog("zooey", 45, 8));

        System.out.println("all dogs: " + dogs);
//        System.out.println("min age 7 " + minAge(dogs, 7).toString());
//        System.out.println("max weight. " + maxWeight(dogs, 40).toString());

        System.out.println("age<7 "+dogQuerier(dogs,d->d.getAge()>=7));
        System.out.println("weight<40 "+dogQuerier(dogs,d->d.getWeight()>=40));
    }

//    static ArrayList<Dog> minAge(ArrayList<Dog> dogList,int testAge){
//
//        ArrayList<Dog> result1=new ArrayList<>();
//        for(Dog d: dogList)
//            if(d.getAge()>=testAge)
//                result1.add(d);
//        return result1;
//
//    }
//
//    static ArrayList<Dog> maxWeight(ArrayList<Dog> dogList,int testWeight){
//
//        ArrayList<Dog> result2=new ArrayList<>();
//        for(Dog d: dogList)
//            if(d.getWeight()>=testWeight)
//                result2.add(d);
//        return result2;
//
//    }

    static ArrayList<Dog> dogQuerier(ArrayList<Dog> dogList, Predicate<Dog> expr) {
        ArrayList<Dog> result1 = new ArrayList<>();

        for (Dog d : dogList)
            if (expr.test(d))
                result1.add(d);
            return result1;

    }



//    DogQuerier dq=new DogQuerier() {
//        @Override
//        public boolean test(Dog d) {
//            return d.getAge()>9;
//        }
//    };

    DogQuerier dq=(d)->d.getAge()>9;




}