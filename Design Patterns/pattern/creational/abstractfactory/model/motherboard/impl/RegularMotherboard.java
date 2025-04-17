package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.Motherboard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;

public class RegularMotherboard implements Motherboard {

    @Override
    public QualityLevel getQualityLevel() {
        return QualityLevel.MEDIUM;
    }

    @Override
    public String getName() {
        return "Motherboard ASRock X570 PHANTOM GAMING 4";
    }

    @Override
    public String getDescription() {
        return "nice and good performance";
    }
}