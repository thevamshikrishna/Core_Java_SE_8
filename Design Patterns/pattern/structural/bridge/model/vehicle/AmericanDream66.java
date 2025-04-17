package pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.vehicle;

import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.Engine;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.Vehicle;

public record AmericanDream66(
        Engine engine
) implements Vehicle {

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public Manufacturer getManufacturer() {
        return Manufacturer.PONY;
    }
}
