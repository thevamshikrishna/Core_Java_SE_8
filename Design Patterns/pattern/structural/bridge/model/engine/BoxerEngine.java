package pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.engine;

import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.Engine;

public record BoxerEngine(
        int horsepower,
        int torque
) implements Engine {

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public int getTorque() {
        return torque;
    }

    @Override
    public CylinderConfiguration getCylinderConfiguration() {
        return CylinderConfiguration.FLAT;
    }
}
