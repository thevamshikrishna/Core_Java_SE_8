package pl.vm.javaguild.designpatterns.pattern.structural.composite.model.gem;

import pl.vm.javaguild.designpatterns.pattern.structural.composite.model.Rarity;
import pl.vm.javaguild.designpatterns.pattern.structural.composite.utility.PowerUtility;

public class Ruby extends Gem {

    public Ruby() {
        super("Ruby", PowerUtility.COMMON_POWER, Rarity.COMMON);
    }
}
