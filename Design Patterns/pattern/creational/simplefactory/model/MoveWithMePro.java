package pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model;

import java.math.BigDecimal;

public class MoveWithMePro extends Gift {

    private static final BigDecimal DEFAULT_PRICE = BigDecimal.valueOf(2000);
    private static final String DESCRIPTION = "Move with Me Pro is a cost-effective walking treadmill for people who work from home.";

    public MoveWithMePro() {
        super(DEFAULT_PRICE, DESCRIPTION);
    }
}
