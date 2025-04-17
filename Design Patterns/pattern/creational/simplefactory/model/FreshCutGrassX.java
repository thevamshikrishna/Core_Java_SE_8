package pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model;

import java.math.BigDecimal;

public class FreshCutGrassX extends Gift {

    private static final BigDecimal DEFAULT_PRICE = BigDecimal.valueOf(2000);
    private static final String DESCRIPTION = "The Fres=h Cut Grass X is designed to take the work out of your hands, leaving you with time to enjoy your garden.";

    public FreshCutGrassX() {
        super(DEFAULT_PRICE, DESCRIPTION);
    }
}

