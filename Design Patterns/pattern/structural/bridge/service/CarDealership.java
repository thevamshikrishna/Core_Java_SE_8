package pl.vm.javaguild.designpatterns.pattern.structural.bridge.service;

import lombok.RequiredArgsConstructor;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.Engine;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.OrderVehicleCommand;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.Vehicle;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.engine.EngineFactory;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.vehicle.VehicleFactory;

@RequiredArgsConstructor
public class CarDealership {

    private final VehicleFactory vehicleFactory;
    private final EngineFactory engineFactory;

    public Vehicle orderBy(OrderVehicleCommand command) {

        Engine engine = engineFactory.findBy(command)
                .orElseGet(() -> engineFactory.createCustomEngine(command));

        return vehicleFactory.findBy(command.manufacturer(), engine)
                .orElseGet(() -> vehicleFactory.createCustomVehicle(command.manufacturer(), engine));
    }
}
