package pl.vm.javaguild.designpatterns.pattern.structural.bridge.model;

import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.engine.CylinderConfiguration;

import java.math.BigDecimal;

/**
 * Describes common methods for 2nd layer of abstraction in Bridge Design Pattern.
 */
public interface Engine {

    /**
     * Gets price of given engine configuration.
     *
     * @return value of price [USD]
     */
    default BigDecimal getPrice() {
        return new BigDecimal(getHorsepower() * getTorque() / 100);
    }

    /**
     * It iss a measurement of the engine's power output
     *
     * @return value of horsepower [HP]
     */
    int getHorsepower();

    /**
     * It is the engine's rotational force or twisting power.
     *
     * @return value of torque [Nm]
     */
    int getTorque();

    /**
     * Gets defines cylinder configuration.
     *
     * @return enum value of {@link CylinderConfiguration}
     */
    CylinderConfiguration getCylinderConfiguration();
}
