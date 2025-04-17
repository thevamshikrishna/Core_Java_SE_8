package pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model;

import java.math.BigDecimal;

public class XPlayOne extends Gift {

    private static final BigDecimal DEFAULT_PRICE = BigDecimal.valueOf(500);
    private static final String DESCRIPTION = "One of the hottest gaming console on the market.";

    public XPlayOne() {
        super(DEFAULT_PRICE, DESCRIPTION);
    }
}
