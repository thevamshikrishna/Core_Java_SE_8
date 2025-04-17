package pl.vm.javaguild.designpatterns.pattern.structural.composite.model.gem;

import pl.vm.javaguild.designpatterns.pattern.structural.composite.model.Rarity;
import pl.vm.javaguild.designpatterns.pattern.structural.composite.utility.PowerUtility;

public class Sapphire extends Gem {

    public Sapphire() {
        super("Sapphire", PowerUtility.LEGENDARY_POWER, Rarity.LEGENDARY);
    }
}
