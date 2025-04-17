package pl.vm.javaguild.designpatterns.pattern.structural.bridge.model;

import pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.vehicle.Manufacturer;

import java.math.BigDecimal;

/**
 * Describes common methods for 1st layer of abstraction in Bridge Design Pattern.
 */
public interface Vehicle {

    /**
     * <b>Most important building block of Bridge Design Pattern</b>
     * <p>
     * It delegates business logic of another abstract layer to another class.
     * <p>
     * In this case details of concrete {@link Engine} are hidden behind interface for loose coupling and possibility,
     * to be able to work on both abstract layers ({@link Engine} and {@link Vehicle}) independently.
     *
     * @return value of engine
     */
    Engine getEngine();

    /**
     * Gets price of given vehicle.
     *
     * @return price.
     */
    default BigDecimal getPrice() {
        return getEngine().getPrice().multiply(new BigDecimal(getManufacturer().getTrendValue()));
    }

    /**
     * Gets original creator.
     *
     * @return value of {@link Manufacturer}
     */
    Manufacturer getManufacturer();
}
