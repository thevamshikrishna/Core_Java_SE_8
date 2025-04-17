package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.GraphicCard;

public class WeakGraphicCard implements GraphicCard {

    @Override
    public QualityLevel getQualityLevel() {
        return QualityLevel.LOW;
    }

    @Override
    public String getName() {
        return "PowerColor AMD Radeon RX 6400";
    }

    @Override
    public String getDescription() {
        return "quite cheap, and enough for old games only";
    }
}
