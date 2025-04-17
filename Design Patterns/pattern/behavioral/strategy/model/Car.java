package pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Car extends Vehicle {
	@Override
	public void drive() {
		System.out.print(getEngine() + " car ");
		super.drive();
	}
}