package pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model;

import java.math.BigDecimal;

public class WaterByGio extends Gift {

    private static final BigDecimal DEFAULT_PRICE = BigDecimal.valueOf(200);
    private static final String DESCRIPTION = "It asserts an accomplished character through a timeless and unexpected scent..";

    public WaterByGio() {
        super(DEFAULT_PRICE, DESCRIPTION);
    }
}
