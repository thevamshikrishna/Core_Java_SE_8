/* Composition is a strong form of association where the child object cannot exist without the parent object.
If the parent object is destroyed, the child object is also destroyed.
*/

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Vehicle {
    private Engine engine;

    public Vehicle(String engineType) {
        this.engine = new Engine(engineType);
    }

    public Engine getEngine() {
        return engine;
    }
}

public class Composition {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("V8");
        System.out.println("Vehicle has an engine of type: " + vehicle.getEngine().getType());
    }
}