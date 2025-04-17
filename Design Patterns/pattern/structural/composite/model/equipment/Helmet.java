package pl.vm.javaguild.designpatterns.pattern.structural.composite.model.equipment;

import lombok.experimental.SuperBuilder;
import pl.vm.javaguild.designpatterns.pattern.structural.composite.Item;
import pl.vm.javaguild.designpatterns.pattern.structural.composite.model.Rarity;

import java.util.ArrayList;
import java.util.List;

@SuperBuilder
public class Helmet extends Equipment {

    public Helmet(String name,
                 Long power,
                 Rarity rarity,
                 List<Item> gems) {
        super(name, power, rarity, gems);
    }

    public Helmet(String name,
                 Long power,
                 Rarity rarity) {
        super(name, power, rarity, new ArrayList<>());
    }
}
