package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.GraphicCard;

public class RegularGraphicCard implements GraphicCard {

    @Override
    public QualityLevel getQualityLevel() {
        return QualityLevel.MEDIUM;
    }

    @Override
    public String getName() {
        return "GeForce RTX 3060 Ti";
    }

    @Override
    public String getDescription() {
        return "semi expensive, quite good graphic card for new games";
    }
}
