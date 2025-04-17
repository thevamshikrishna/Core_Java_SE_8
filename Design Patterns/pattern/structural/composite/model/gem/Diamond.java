package pl.vm.javaguild.designpatterns.pattern.structural.composite.model.gem;

import pl.vm.javaguild.designpatterns.pattern.structural.composite.model.Rarity;
import pl.vm.javaguild.designpatterns.pattern.structural.composite.utility.PowerUtility;

public class Diamond extends Gem {

    public Diamond() {
        super("Diamond", PowerUtility.UNIQUE_POWER, Rarity.UNIQUE);
    }
}
