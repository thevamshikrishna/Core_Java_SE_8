package pl.vm.javaguild.designpatterns.pattern.behavioral.strategy;

import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.factory.VehicleFactory;
import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model.Vehicle;

public class StrategyApplication {

    public static void main(String[] args) {
        Vehicle truck = VehicleFactory.getVehicle("truck");
        truck.drive();

        Vehicle bus = VehicleFactory.getVehicle("bus");
        bus.drive();

        Vehicle car = VehicleFactory.getVehicle("car");
        car.drive();
    }
}