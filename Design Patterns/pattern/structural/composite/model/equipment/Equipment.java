package pl.vm.javaguild.designpatterns.pattern.structural.composite.model.equipment;

import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import pl.vm.javaguild.designpatterns.pattern.structural.composite.Item;
import pl.vm.javaguild.designpatterns.pattern.structural.composite.model.Rarity;
import pl.vm.javaguild.designpatterns.pattern.structural.composite.utility.PowerUtility;

import java.util.List;

@SuperBuilder
@RequiredArgsConstructor
abstract class Equipment implements Item {

    protected final String name;
    protected final Long power;
    protected final Rarity rarity;
    protected final List<Item> gems;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getPower() {
        return power + PowerUtility.calculatePower(gems);
    }

    @Override
    public void add(Item item) {
        gems.add(item);
    }

    @Override
    public void remove(Item item) {
        gems.remove(item);
    }

    public Rarity getRarity() {
        return rarity;
    }
}
