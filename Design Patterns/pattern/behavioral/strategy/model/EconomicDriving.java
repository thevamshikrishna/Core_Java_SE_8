package pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model;

import lombok.extern.slf4j.Slf4j;
import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.VehicleBehavior;

@Slf4j
public class EconomicDriving implements VehicleBehavior {
	public void perform() {
		log.info("economic driving");
	}
}

