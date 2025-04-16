package Example;

public class EngineeringStudent implements Student {

    @Override
    public String getBio(String name) {
        return name+" is Engineering Student !";
    }
}

