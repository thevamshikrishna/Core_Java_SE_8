package pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.VehicleBehavior;

@SuperBuilder
@Getter
public abstract class Vehicle {
	private int wheels;
	private int seats;
	private String engine;

	private VehicleBehavior behavior;
	public void drive(){
		behavior.perform();
	};
}