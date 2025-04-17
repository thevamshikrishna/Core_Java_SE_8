package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.Motherboard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;

public class WeakMotherboard implements Motherboard {

    @Override
    public QualityLevel getQualityLevel() {
        return QualityLevel.LOW;
    }

    @Override
    public String getName() {
        return "Motherboard ASRock B450M-HDV R4.0";
    }

    @Override
    public String getDescription() {
        return "Cheaper, but still nice quality";
    }
}