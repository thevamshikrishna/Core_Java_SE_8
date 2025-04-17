package pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.factory;

import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model.Bus;
import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model.EconomicDriving;
import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model.Vehicle;

public class BusCreator implements VehicleCreator {
	public Vehicle buildVehicle() {
		return Bus.builder().seats(50).wheels(6).engine("6.0L V6 diesel").behavior(new EconomicDriving()).build();
	}
}
