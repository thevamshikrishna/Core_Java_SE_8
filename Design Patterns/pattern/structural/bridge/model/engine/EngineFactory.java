package pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.engine;

import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.Engine;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.OrderVehicleCommand;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class EngineFactory {

    private final List<Engine> engines = List.of(
            new BoxerEngine(300, 280),
            new StraightTwinEngine(50, 40),
            new V12Engine(850, 1100)
    );

    public Engine getBy(CylinderConfiguration cylinderConfiguration) {
        return findBy(cylinderConfiguration)
                .orElseThrow();
    }

    public Optional<Engine> findBy(CylinderConfiguration cylinderConfiguration) {
        return engines.stream()
                .filter(engine -> engine.getCylinderConfiguration() == cylinderConfiguration)
                .findFirst();
    }

    public Optional<Engine> findBy(OrderVehicleCommand command) {
        return engines.stream()
                .filter(this.filter(command))
                .findFirst();
    }

    private Predicate<Engine> filter(OrderVehicleCommand command) {
        return engine -> engine.getHorsepower() == command.horsepower()
                && engine.getTorque() == command.torque()
                && engine.getCylinderConfiguration() == command.cylinderConfiguration();
    }

    public Engine createCustomEngine(OrderVehicleCommand command) {
        return new Engine() {
            @Override
            public int getHorsepower() {
                return command.horsepower();
            }

            @Override
            public int getTorque() {
                return command.torque();
            }

            @Override
            public CylinderConfiguration getCylinderConfiguration() {
                return command.cylinderConfiguration();
            }
        };
    }
}
