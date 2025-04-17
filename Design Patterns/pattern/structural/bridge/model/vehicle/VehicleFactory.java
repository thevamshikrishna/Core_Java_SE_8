package pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.vehicle;

import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.Engine;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.Vehicle;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.engine.CylinderConfiguration;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.engine.EngineFactory;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class VehicleFactory {

    private final List<Vehicle> vehicles;

    public VehicleFactory(EngineFactory engineFactory) {
        vehicles = List.of(
                new Porsza911(engineFactory.getBy(CylinderConfiguration.FLAT)),
                new AlmostItalianBeast(engineFactory.getBy(CylinderConfiguration.INLINE)),
                new AmericanDream66(engineFactory.getBy(CylinderConfiguration.V_SHAPED))
        );
    }

    public Optional<Vehicle> findBy(Manufacturer manufacturer, Engine engine) {
        return findBy(manufacturer)
                .filter(vehicle -> Objects.equals(vehicle.getEngine(), engine));
    }

    public Optional<Vehicle> findBy(Manufacturer manufacturer) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.getManufacturer() == manufacturer)
                .findFirst();
    }

    public Vehicle createCustomVehicle(Manufacturer manufacturer, Engine engine) {
        return new Vehicle() {
            @Override
            public Engine getEngine() {
                return engine;
            }

            @Override
            public Manufacturer getManufacturer() {
                return manufacturer;
            }
        };
    }
}