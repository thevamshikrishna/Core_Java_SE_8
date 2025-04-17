package pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.factory;

import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model.Vehicle;

public interface VehicleCreator {
	Vehicle buildVehicle();
}
