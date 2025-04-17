package pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model;

import java.math.BigDecimal;

public class FlyAndAdmire5 extends Gift {

    private static final BigDecimal DEFAULT_PRICE = BigDecimal.valueOf(2000);
    private static final String DESCRIPTION = "One of the most capable small drones on the market.";

    public FlyAndAdmire5() {
        super(DEFAULT_PRICE, DESCRIPTION);
    }
}
