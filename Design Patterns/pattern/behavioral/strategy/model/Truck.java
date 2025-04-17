package pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model;

import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuperBuilder
public class Truck extends Vehicle {
	@Override
	public void drive() {
		log.info(getEngine() + " truck ");
		super.drive();
	}
}