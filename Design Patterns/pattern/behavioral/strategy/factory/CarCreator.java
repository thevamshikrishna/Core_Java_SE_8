package pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.factory;

import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model.AggressiveDriving;
import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model.Car;
import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model.Vehicle;

class CarCreator implements VehicleCreator {
	public Vehicle buildVehicle() {
		return Car.builder().seats(5).wheels(4).engine("2.0L R4 petrol").behavior(new AggressiveDriving()).build();
	}
}
