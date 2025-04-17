package pl.vm.javaguild.designpatterns.pattern.structural.composite.model.character;

import lombok.experimental.SuperBuilder;
import pl.vm.javaguild.designpatterns.pattern.structural.composite.Item;

import java.util.ArrayList;
import java.util.List;

@SuperBuilder
public class Druid extends Character {

    public Druid(String name, Long power) {
        this(name, power, new ArrayList<>());
    }

    public Druid(String name, Long power, List<Item> equipment) {
        super(name, power, equipment);
    }
}
