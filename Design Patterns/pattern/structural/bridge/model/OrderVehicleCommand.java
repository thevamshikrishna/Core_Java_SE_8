package pl.vm.javaguild.designpatterns.pattern.structural.bridge.model;

import lombok.Builder;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.engine.CylinderConfiguration;
import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.vehicle.Manufacturer;

import java.math.BigDecimal;

@Builder
public record OrderVehicleCommand(
        BigDecimal price,
        CylinderConfiguration cylinderConfiguration,
        Manufacturer manufacturer,
        int horsepower,
        int torque
) {

}
