public class Dog {
     String name;
     int weight;
     int age;

    //Constructor assigns a name, weight and age
    Dog(String name,int weight,int age){
        this.name=name;
        this.weight=weight;
        this.age=age;
    }
    //------------------------------------------------------------------------

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    int getWeight(){
        return weight;
    }

    //------------------------------------------------------------------

//    public String toString(){
//        return name;
//    }

    @Override
    public String toString() {
        return name;
    }


}
