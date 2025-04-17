package pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

/**
 * Base class containing all relevant information about gift.
 */
@RequiredArgsConstructor
public abstract class Gift {

    private final BigDecimal price;
    private final String description;

    @Override
    public String toString() {
        return """
                Name: %s
                Price: %s
                Description: %s
                """.formatted(
                this.getClass().getSimpleName(),
                price,
                description
        );
    }
}
