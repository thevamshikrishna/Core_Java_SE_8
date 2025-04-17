package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.Motherboard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;

public class PowerfulMotherboard implements Motherboard {

    @Override
    public QualityLevel getQualityLevel() {
        return QualityLevel.HIGH;
    }

    @Override
    public String getName() {
        return "ASUS ROG MAXIMUS Z790 EXTREME";
    }

    @Override
    public String getDescription() {
        return "Insanely expensive and only for freaks, and guys that sleep on money";
    }
}