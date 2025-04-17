package pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.vehicle;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Popular vehicle's manufacturers/
 */
@RequiredArgsConstructor
@Getter
public enum Manufacturer {
    /**
     * Legendary, german sports car.
     */
    PORSZA(2),
    /**
     * Iconic, american muscle car.
     */
    PONY(4),
    /**
     * German-italian concept car.
     */
    PASSERATTI(8)
    ;

    private final int trendValue;
}
