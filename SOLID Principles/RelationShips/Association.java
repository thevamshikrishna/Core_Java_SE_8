/* Association represents a relationship between two separate classes that establish through their objects.
 It can be one-to-one, one-to-many, many-to-one, or many-to-many. */

class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

public class Association {
    public static void main(String[] args) {
        Driver driver = new Driver("John");
        Car car = new Car("Toyota");

        System.out.println(driver.getName() + " drives a " + car.getModel());
    }
}
