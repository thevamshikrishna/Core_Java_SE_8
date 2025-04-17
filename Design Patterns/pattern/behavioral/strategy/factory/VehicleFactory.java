package pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.factory;

import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model.Vehicle;

public class VehicleFactory {
	public static Vehicle getVehicle(String type) {
        return switch (type) {
            case "truck" -> new TruckCreator().buildVehicle();
            case "bus" -> new BusCreator().buildVehicle();
            case "car" -> new CarCreator().buildVehicle();
            default -> throw new IllegalArgumentException("Unknown vehicle type");
        };
	}
}